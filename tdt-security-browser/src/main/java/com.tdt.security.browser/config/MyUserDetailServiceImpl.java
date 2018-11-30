package com.tdt.security.browser.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
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

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //根据用户名查找用户信息
        logger.info("登录用户名:\t" + username);
        String password = passwordEncoder.encode("123456");//注册时的操作，实际只需要从数据库中查出用户密码就行了
        logger.info("数据库密码是:\t" + password);
        //参数：用户名，密码，权限集合
        return new User(username, password, true, true, true, true,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//        return new User(username,"123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
