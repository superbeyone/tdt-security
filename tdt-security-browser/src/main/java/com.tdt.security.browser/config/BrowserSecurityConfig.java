package com.tdt.security.browser.config;

import com.tdt.security.browser.authentication.TdtAuthenticationFailureHandler;
import com.tdt.security.browser.authentication.TdtAuthenticationSuccessHandler;
import com.tdt.security.properties.SecurityProperties;
import com.tdt.security.validate.code.ValidateCodeFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @Project: tdt-security
 * @ClassName: BrowserSecurityConfig
 * @Description: 浏览器配置类
 * @Author: Mr.superbeyone
 * @Create: 2018-11-28 16:44
 **/
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    SecurityProperties securityProperties;

    @Autowired
    TdtAuthenticationSuccessHandler tdtAuthenticationSuccessHandler;

    @Autowired
    TdtAuthenticationFailureHandler tdtAuthenticationFailureHandler;

    @Bean
    public PasswordEncoder BCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        ValidateCodeFilter validateCodeFilter = new ValidateCodeFilter();
        validateCodeFilter.setAuthenticationFailureHandler(tdtAuthenticationFailureHandler);
        validateCodeFilter.setSecurityProperties(securityProperties);
        validateCodeFilter.afterPropertiesSet();

        http.addFilterBefore(validateCodeFilter, UsernamePasswordAuthenticationFilter.class)
                .formLogin()   //想用默认的HttpBasic登录使用    http.httpBasic()
                .loginPage("/authentication/require")
                .loginProcessingUrl("/authentication/form")
                .successHandler(tdtAuthenticationSuccessHandler)
                .failureHandler(tdtAuthenticationFailureHandler)
                .and()
                .authorizeRequests()//下面的配置都是授权配置
                .antMatchers("/authentication/require",
                        securityProperties.getBrowser().getLoginPage(),
                        "/code/image")
                .permitAll()
                .anyRequest()//任何请求
                .authenticated()//都需要身份认证
                .and()
                .csrf().disable();//关闭跨站请求防护
    }
}
