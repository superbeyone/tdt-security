package com.tdt.security.browser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Project: tdt-security
 * @ClassName: BrowserSecurityConfig
 * @Description: 浏览器配置类
 * @Author: Mr.superbeyone
 * @Create: 2018-11-28 16:44
 **/
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.formLogin()   //想用默认的HttpBasic登录使用    http.httpBasic()
                .and()
                .authorizeRequests()//下面的配置都是授权配置
                .anyRequest()//任何请求
                .authenticated();//都需要身份认证
    }
}
