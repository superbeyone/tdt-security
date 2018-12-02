package com.tdt.security.code;

import com.tdt.security.validate.code.ImageCode;
import com.tdt.security.validate.code.ValidateCodeGenerator;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * @Project: tdt-security
 * @ClassName: ApplyImageCodeGenerator
 * @Author: Mr.superbeyone
 * @Time: 2018-12-02 19:23
 * @Description: 用户实现的imageCodeGenerator的Bean用以替换默认的Bean
 **/
//@Component("imageCodeGenerator")
public class ApplyImageCodeGenerator implements ValidateCodeGenerator {
    @Override
    public ImageCode generate(ServletWebRequest request) {
        //TODO:用户自定义的图形验证码生成策略
        return null;
    }
}
