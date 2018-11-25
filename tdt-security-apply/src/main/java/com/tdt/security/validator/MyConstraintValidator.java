package com.tdt.security.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Project: tdt-security
 * @ClassName: MyConstraintValidator
 * @Author: Mr.superbeyone
 * @Time: 2018-11-25 17:31
 * @Description: 自定义接口实现类
 **/

public class MyConstraintValidator implements ConstraintValidator<MyConstraint, Object> {



    @Override
    public void initialize(MyConstraint constraintAnnotation) {
        System.out.println("my constraint validator init");
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        System.out.println(value);
        return false;
    }
}
