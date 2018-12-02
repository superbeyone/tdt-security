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

    private LoginType loginType = LoginType.JSON;//默认返回JSON

    private int rememberMeSeconds = 3600;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }

    public int getRememberMeSeconds() {
        return rememberMeSeconds;
    }

    public void setRememberMeSeconds(int rememberMeSeconds) {
        this.rememberMeSeconds = rememberMeSeconds;
    }
}

