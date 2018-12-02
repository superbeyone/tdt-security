package com.tdt.security.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Project: tdt-security
 * @ClassName: SecurityProperties
 * @Author: Mr.superbeyone
 * @Time: 2018-11-30 23:05
 * @Description: 自定义配置项
 **/
@ConfigurationProperties("tdt.security")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();
    private ValidateCodeProperties code = new ValidateCodeProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }

    public ValidateCodeProperties getCode() {
        return code;
    }

    public void setCode(ValidateCodeProperties code) {
        this.code = code;
    }
}
