package com.tdt.security.browser.authentication;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Project: tdt-security
 * @ClassName: TdtAuthenticationSuccessHandler
 * @Author: Mr.superbeyone
 * @Time: 2018-12-01 15:19
 * @Description: 自定义登录成功处理
 **/
@Component
public class TdtAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ObjectMapper objectMapper;

    /**
     *
     * @param request
     * @param response
     * @param authentication    封装认证信息（包括UserDetails)
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        logger.info("登录成功");
//        response.setContentType("application/json:charset=utf-8");
        response.getWriter().write(objectMapper.writeValueAsString(authentication));
    }
}
