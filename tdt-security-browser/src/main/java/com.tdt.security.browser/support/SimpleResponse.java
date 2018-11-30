package com.tdt.security.browser.support;

/**
 * @Project: tdt-security
 * @ClassName: SimpleResponse
 * @Author: Mr.superbeyone
 * @Time: 2018-11-30 22:53
 * @Description: 返回结果简单包装
 **/

public class SimpleResponse {
    public SimpleResponse(Object content) {
        this.content = content;
    }

    private Object content;

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
