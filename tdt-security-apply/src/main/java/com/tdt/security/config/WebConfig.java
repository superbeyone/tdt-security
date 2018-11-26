package com.tdt.security.config;

import com.tdt.security.filter.TimeFilter;
import com.tdt.security.interceptor.TimeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;

/**
 * @Project: tdt-security
 * @ClassName: WebConfig
 * @Author: Mr.superbeyone
 * @Time: 2018-11-25 23:36
 * @Description: 自定义配置类
 **/
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Autowired
    TimeInterceptor timeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(timeInterceptor);
    }

    @Bean
    public FilterRegistrationBean timeFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        TimeFilter timeFilter = new TimeFilter();

        registrationBean.setFilter(timeFilter);

        ArrayList<String> urls = new ArrayList<>();
        urls.add("/*");
        registrationBean.setUrlPatterns(urls);
        return registrationBean;
    }
}
