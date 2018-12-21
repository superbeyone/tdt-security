package com.tdt.security.core.properties;

/**
 * @Project: tdt-security
 * @ClassName: SessionProperties
 * @Description: Session配置类
 * @Author: Mr.superbeyone
 * @Create: 2018-12-13 15:11
 **/

public class SessionProperties {
    /**
     * 同一个用户在系统中的最大Session数，默认1
     */
    private int maximumSessions = 1;
    /**
     * 达到最大Session时，是否阻止新的登录请求，默认为false，不阻止，新的登录请求会把老的登录失效掉
     */
    private boolean maxSessionPreventsLogin;
    /**
     * session失效时跳转的地址
     */
    private String sessionInvalidUrl = SecurityConstants.DEFAULT_SESSION_INVALID_URL;


    public int getMaximumSessions() {
        return maximumSessions;
    }

    public void setMaximumSessions(int maximumSessions) {
        this.maximumSessions = maximumSessions;
    }

    public boolean isMaxSessionPreventsLogin() {
        return maxSessionPreventsLogin;
    }

    public void setMaxSessionPreventsLogin(boolean maxSessionPreventsLogin) {
        this.maxSessionPreventsLogin = maxSessionPreventsLogin;
    }

    public String getSessionInvalidUrl() {
        return sessionInvalidUrl;
    }

    public void setSessionInvalidUrl(String sessionInvalidUrl) {
        this.sessionInvalidUrl = sessionInvalidUrl;
    }
}
