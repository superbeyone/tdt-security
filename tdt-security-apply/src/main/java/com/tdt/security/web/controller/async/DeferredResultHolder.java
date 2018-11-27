package com.tdt.security.web.controller.async;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project: tdt-security
 * @ClassName: DeferredResultHolder
 * @Description: 传递DeferredResult结果对象
 * @Author: Mr.superbeyone
 * @Create: 2018-11-27 13:43
 **/
@Component
public class DeferredResultHolder {

    private Map<String, DeferredResult<String>> map = new HashMap<>();

    public Map<String, DeferredResult<String>> getMap() {
        return map;
    }

    public void setMap(Map<String, DeferredResult<String>> map) {
        this.map = map;
    }
}
