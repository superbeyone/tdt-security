package com.tdt.security.web.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

/**
 * @Project: tdt-security
 * @ClassName: TimeAspect
 * @Author: Mr.superbeyone
 * @Time: 2018-11-26 19:58
 * @Description: 自定义切片
 **/
//@Aspect
//@Component
public class TimeAspect {
    @Around("execution(* com.tdt.security.web.controller.UserController.*(..))")
    public Object handlerControllerMethod(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("time aspect start");

        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("arg is：\t" + arg);
        }
        Object object = joinPoint.proceed();
        System.out.println("time aspect end");

        return object;
    }
}
