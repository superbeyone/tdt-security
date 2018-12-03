package com.tdt.security.validate.code;

import com.tdt.security.properties.SecurityProperties;
import com.tdt.security.validate.code.sms.DefaultSmsCodeSender;
import com.tdt.security.validate.code.sms.SmsCodeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Project: tdt-security
 * @ClassName: ValidateCodeBeanConfig
 * @Author: Mr.superbeyone
 * @Time: 2018-12-02 19:16
 * @Description: 校验码Bean配置类
 **/
@Configuration
public class ValidateCodeBeanConfig {

    @Autowired
    SecurityProperties securityProperties;

    @Bean
    @ConditionalOnMissingBean(name = "imageCodeGenerator")
    public ValidateCodeGenerator imageCodeGenerator() {
        ImageCodeGenerator imageCodeGenerator = new ImageCodeGenerator();
        imageCodeGenerator.setSecurityProperties(securityProperties);
        return imageCodeGenerator;
    }

    @Bean
//    @ConditionalOnMissingBean(name = "smsCodeGenerator")//第一种写法
    @ConditionalOnMissingBean(SmsCodeSender.class) //第二种写法
    public SmsCodeSender smsCodeSender() {
        return new DefaultSmsCodeSender();
    }
}
