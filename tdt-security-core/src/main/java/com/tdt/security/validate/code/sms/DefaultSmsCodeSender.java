package com.tdt.security.validate.code.sms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Project: tdt-security
 * @ClassName: DefaultSmsCodeSender
 * @Description: 短信验证码默认实现
 * @Author: Mr.superbeyone
 * @Create: 2018-12-03 13:27
 **/

public class DefaultSmsCodeSender implements SmsCodeSender {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void send(String mobile, String code) {
        logger.debug("向手机{},发送短信验证码{}", mobile, code);
    }
}
