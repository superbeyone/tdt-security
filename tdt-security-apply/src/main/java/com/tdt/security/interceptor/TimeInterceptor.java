package com.tdt.security.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Project: tdt-security
 * @ClassName: TimeInterceptor
 * @Author: Mr.superbeyone
 * @Time: 2018-11-26 19:25
 * @Description: 自定义拦截器
 **/
@Component
public class TimeInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        System.out.println("请求Controller:\t" + ((HandlerMethod) handler).getBean().getClass().getName());
        System.out.println("请求Method:\t" + ((HandlerMethod) handler).getMethod().getName());
        request.setAttribute("startTime", System.currentTimeMillis());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandler");
        Long startTime = (Long) request.getAttribute("startTime");
        System.out.println("执行时间为:\t" + (System.currentTimeMillis() - startTime) + "毫秒");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("completion");
        Long startTime = (Long) request.getAttribute("startTime");
        System.out.println("执行完Interceptor时间为:\t" + (System.currentTimeMillis() - startTime) + "毫秒");
        System.out.println("异常ex:\t" + ex);
    }
}
