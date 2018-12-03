package com.tdt.security.properties;

/**
 * @Project: tdt-security
 * @ClassName: ImageCodeProperties
 * @Author: Mr.superbeyone
 * @Time: 2018-12-02 18:05
 * @Description: 图形验证码配置类
 **/

public class ImageCodeProperties extends SmsCodeProperties {

    public ImageCodeProperties() {
        setLength(4);
    }

    private int width = 67;
    private int height = 30;


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

}
