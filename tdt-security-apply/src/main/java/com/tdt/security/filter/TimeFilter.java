package com.tdt.security.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Project: tdt-security
 * @ClassName: TimerFilter
 * @Author: Mr.superbeyone
 * @Time: 2018-11-25 23:28
 * @Description: 过滤器
 **/
//@Component
public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("time filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("time filter start");
        long start = System.currentTimeMillis();
        chain.doFilter(request, response);
        System.out.println("执行了:" + (System.currentTimeMillis() - start) + "毫秒");
        System.out.println("time filter finish");
    }

    @Override
    public void destroy() {
        System.out.println("time filter destroy");
    }
}
