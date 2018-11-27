package com.tdt.security.web.controller.async;

import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * @Project: tdt-security
 * @ClassName: AsyncController
 * @Description: 异步处理
 * @Author: Mr.superbeyone
 * @Create: 2018-11-27 12:15
 **/
@RestController
public class AsyncController {

    @Autowired
    MockQueue mockQueue;

    @Autowired
    DeferredResultHolder deferredResultHolder;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/order")
    public DeferredResult<String> order() {
        logger.info("主线程开始");

        //随机生成8位数字作为订单号
        String orderNumber = RandomStringUtils.randomNumeric(8);

        mockQueue.setPlaceOrder(orderNumber);
        DeferredResult<String> result = new DeferredResult<>();

        deferredResultHolder.getMap().put(orderNumber, result);
//        Callable<String> result = () -> {
//            logger.info("副线程开始");
//            Thread.sleep(1000);
//            logger.info("副线程返回");
//            return "success";
//        };
        logger.info("主线程返回");
        return result;
    }
}
