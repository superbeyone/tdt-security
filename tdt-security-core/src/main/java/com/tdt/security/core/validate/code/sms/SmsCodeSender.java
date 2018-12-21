package com.tdt.security.core.validate.code.sms;

/**
 * @Project: tdt-security
 * @ClassName: SmsCodeSender
 * @Description: 短信供应商发送短信接口
 * @Author: Mr.superbeyone
 * @Create: 2018-12-03 13:26
 **/

public interface SmsCodeSender {
    void send(String mobile, String code);

}
