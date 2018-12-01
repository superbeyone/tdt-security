package com.tdt.security.browser.controller;

import com.tdt.security.browser.support.SimpleResponse;
import com.tdt.security.properties.SecurityProperties;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Project: tdt-security
 * @ClassName: BrowserSecurityController
 * @Author: Mr.superbeyone
 * @Time: 2018-11-30 22:35
 * @Description: BrowserSecurityController
 **/
@RestController
public class BrowserSecurityController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    //缓存请求
    private RequestCache requestCache = new HttpSessionRequestCache();
    //Sprig 跳转工具类
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Autowired
    SecurityProperties securityProperties;

    /**
     * 当需要身份认证时，跳转到这里
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/authentication/require")
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED) //401 未授权
    public SimpleResponse requireAuthentication(HttpServletRequest request, HttpServletResponse response) throws IOException {

        SavedRequest savedRequest = requestCache.getRequest(request, response);

        if (savedRequest != null) {
            String targetUrl = savedRequest.getRedirectUrl();
            logger.debug("引发跳转的请求是:\t{}", targetUrl);
            if (StringUtils.endsWithIgnoreCase(targetUrl, ".html")) {
                redirectStrategy.sendRedirect(request, response, securityProperties.getBrowser().getLoginPage());
            }
        }
        return new SimpleResponse("访问服务需要身份认证，请引导用户到登录页面");
    }

}
