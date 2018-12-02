package com.tdt.security.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 * @Project: tdt-security
 * @ClassName: ValidateCodeException
 * @Author: Mr.superbeyone
 * @Time: 2018-12-02 17:15
 * @Description: 图形验证码异常
 **/

public class ValidateCodeException extends AuthenticationException {
    public ValidateCodeException(String msg) {
        super(msg);
    }
}
