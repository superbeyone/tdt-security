package com.tdt.security.web.controller;

import com.tdt.security.pojo.FileInfo;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;

/**
 * @Project: tdt-security
 * @ClassName: FileController
 * @Author: Mr.superbeyone
 * @Time: 2018-11-26 22:17
 * @Description: 文件上传Controller
 **/
@RestController
@RequestMapping("/file")
public class FileController {
    //上传后文件保存目录
    String folder = "D:\\";

    @PostMapping
    public FileInfo upload(MultipartFile file) throws IOException {


        System.out.println("参数名字:\t" + file.getName());
        System.out.println("原始文件名:\t" + file.getOriginalFilename());
        System.out.println("文件大小:\t" + file.getSize());


        File saveFile = new File(folder, new Date().getTime() + ".txt");
        //保存到本地
        file.transferTo(saveFile);

        //保存到远程使用
        //file.getInputStream()
        return new FileInfo(saveFile.getAbsolutePath());

    }

    @GetMapping("/{id}")
    public void download(@PathVariable String id, HttpServletRequest request, HttpServletResponse response) {
        try (
                InputStream inputStream = new FileInputStream(new File(folder, id + ".txt"));
                OutputStream outputStream = response.getOutputStream()
        ) {
            response.setContentType("application/x-download");
            response.addHeader("Content-Disposition", "attachment;filename=test.txt");//定义下载的文件名

            IOUtils.copy(inputStream, outputStream);
            outputStream.flush();
        } catch (Exception e) {

        }
    }

}
