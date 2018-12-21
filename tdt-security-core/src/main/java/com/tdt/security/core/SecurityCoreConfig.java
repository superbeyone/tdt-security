package com.tdt.security.core;

import com.tdt.security.core.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Project: tdt-security
 * @ClassName: SecurityCoreConfig
 * @Author: Mr.superbeyone
 * @Time: 2018-11-30 23:13
 * @Description: Security核心模块配置，让SecurityProperties配置类生效
 **/
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {

}
