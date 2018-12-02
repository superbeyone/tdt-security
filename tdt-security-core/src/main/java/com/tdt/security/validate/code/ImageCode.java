package com.tdt.security.validate.code;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * @Project: tdt-security
 * @ClassName: ImageCode
 * @Author: Mr.superbeyone
 * @Time: 2018-12-02 16:11
 * @Description: 图形验证码封装
 **/

public class ImageCode {
    private BufferedImage image;

    private String code;

    private LocalDateTime expireTime;//过期时间

    public ImageCode(BufferedImage image, String code, int expireIn) {
        this.image = image;
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public ImageCode(BufferedImage image, String code, LocalDateTime expireTime) {
        this.image = image;
        this.code = code;
        this.expireTime = expireTime;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }

    public boolean isExpired() {
        return LocalDateTime.now().isAfter(expireTime);
    }
}
