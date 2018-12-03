package com.tdt.security.properties;

/**
 * @Project: tdt-security
 * @ClassName: ValidateCodeProperties
 * @Author: Mr.superbeyone
 * @Time: 2018-12-02 18:07
 * @Description: 验证码配置类
 **/

public class ValidateCodeProperties {
    private ImageCodeProperties image = new ImageCodeProperties();

    private SmsCodeProperties sms = new SmsCodeProperties();

    public ImageCodeProperties getImage() {
        return image;
    }

    public void setImage(ImageCodeProperties image) {
        this.image = image;
    }

    public SmsCodeProperties getSms() {
        return sms;
    }

    public void setSms(SmsCodeProperties sms) {
        this.sms = sms;
    }
}
