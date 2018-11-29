package com.tdt.security.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @Project: tdt-security
 * @ClassName: MyUserDetailServiceImpl
 * @Description: 实现UserDetailService接口
 * @Author: Mr.superbeyone
 * @Create: 2018-11-29 10:48
 **/
@Component
public class MyUserDetailServiceImpl implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //根据用户名查找用户信息
        logger.info("登录用户名:\t"+username);
        //参数：用户名，密码，权限
        return new User(username,"123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
