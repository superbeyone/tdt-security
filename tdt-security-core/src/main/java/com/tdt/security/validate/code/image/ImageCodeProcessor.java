package com.tdt.security.validate.code.image;

import com.tdt.security.validate.code.impl.AbstractValidateCodeProcessor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import javax.imageio.ImageIO;

/**
 * @Project: tdt-security
 * @ClassName: ImageCodeProcessor
 * @Description: 图片验证码处理器
 * @Author: Mr.superbeyone
 * @Create: 2018-12-03 15:12
 **/
@Component("imageValidateCodeProcessor")
public class ImageCodeProcessor extends AbstractValidateCodeProcessor<ImageCode> {

    /**
     * 发送图形验证码，将其写到响应中
     *
     * @param request
     * @param imageCode
     * @throws Exception
     */
    @Override
    protected void send(ServletWebRequest request, ImageCode imageCode) throws Exception {
        ImageIO.write(imageCode.getImage(), "JPEG", request.getResponse().getOutputStream());
    }
}
