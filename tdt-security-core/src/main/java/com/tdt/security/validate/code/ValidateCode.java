package com.tdt.security.validate.code;

import java.time.LocalDateTime;

/**
 * @Project: tdt-security
 * @ClassName: SmsCode
 * @Author: Mr.superbeyone
 * @Time: 2018-12-02 16:11
 * @Description: 短信验证码封装
 **/

public class ValidateCode {

    private String code;

    private LocalDateTime expireTime;//过期时间

    public ValidateCode(String code, int expireIn) {
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public ValidateCode(String code, LocalDateTime expireTime) {
        this.code = code;
        this.expireTime = expireTime;
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
