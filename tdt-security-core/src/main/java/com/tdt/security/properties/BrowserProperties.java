package com.tdt.security.properties;

/**
 * @Project: tdt-security
 * @ClassName: BrowserProperties
 * @Author: Mr.superbeyone
 * @Time: 2018-11-30 23:07
 * @Description: 自定义浏览器配置项
 **/

public class BrowserProperties {
    private String loginPage = "/tdt-signIn.html";

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }
}

