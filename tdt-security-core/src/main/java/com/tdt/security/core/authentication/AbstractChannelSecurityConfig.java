package com.tdt.security.core.authentication;

import com.tdt.security.core.properties.SecurityConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * @Project: tdt-security
 * @ClassName: AbstractChannelSecurityConfig
 * @Description: 公用配置抽象
 * @Author: Mr.superbeyone
 * @Create: 2018-12-13 14:37
 **/

public class AbstractChannelSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    AuthenticationSuccessHandler tdtAuthenticationSuccessHandler;

    @Autowired
    AuthenticationFailureHandler tdtAuthenticationFailureHandler;

    protected void applyPasswordAuthenticationConfig(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL)
                .loginProcessingUrl(SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_FORM)
                .successHandler(tdtAuthenticationSuccessHandler)
                .failureHandler(tdtAuthenticationFailureHandler);
    }

}
