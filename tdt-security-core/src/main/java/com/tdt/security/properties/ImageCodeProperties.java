package com.tdt.security.properties;

/**
 * @Project: tdt-security
 * @ClassName: ImageCodeProperties
 * @Author: Mr.superbeyone
 * @Time: 2018-12-02 18:05
 * @Description: 图形验证码配置类
 **/

public class ImageCodeProperties {

    private int width = 67;
    private int height = 30;
    private int length = 4;
    private int expireIn = 60;
    private String url;


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(int expireIn) {
        this.expireIn = expireIn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
