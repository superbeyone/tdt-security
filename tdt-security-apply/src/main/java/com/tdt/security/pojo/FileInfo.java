package com.tdt.security.pojo;

/**
 * @Project: tdt-security
 * @ClassName: FileInfo
 * @Author: Mr.superbeyone
 * @Time: 2018-11-26 22:19
 * @Description: 文件对象实体
 **/

public class FileInfo {
    private String path;

    public FileInfo(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
