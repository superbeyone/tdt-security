package com.tdt.security.core.validate.code;

/**
 * @Project: tdt-security
 * @ClassName: ValidateCodeType
 * @Description: 校验码类型封装
 * @Author: Mr.superbeyone
 * @Create: 2018-12-03 14:06
 **/

public enum ValidateCodeType {

    /**
     * 短信验证码
     */
    SMS {
        @Override
        public String getParamNamesOnValidate() {
            return null;
        }
    },
    /**
     * 图片验证码
     */
    IMAGE {
        @Override
        public String getParamNamesOnValidate() {
            return null;
        }
    };

    /**
     * 校验时，从请求中获取参数的名字
     *
     * @return
     */
    public abstract String getParamNamesOnValidate();
}
