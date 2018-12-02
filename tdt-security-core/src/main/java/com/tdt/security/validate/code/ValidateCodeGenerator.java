package com.tdt.security.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @Project: tdt-security
 * @ClassName: ValidateCodeGenerator
 * @Author: Mr.superbeyone
 * @Time: 2018-12-02 19:08
 * @Description: 校验码生成器
 **/

public interface ValidateCodeGenerator {

    ImageCode generate(ServletWebRequest request);
}
