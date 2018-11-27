package com.tdt.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Project: tdt-security
 * @ClassName: TdtSecurityApplyApplication
 * @Author: Mr.superbeyone
 * @Time: 2018-11-24 16:21
 * @Description: SecurityApply
 **/

@SpringBootApplication
@EnableSwagger2
public class TdtSecurityApplyApplication {
    public static void main(String[] args) {
        SpringApplication.run(TdtSecurityApplyApplication.class, args);
    }

}


