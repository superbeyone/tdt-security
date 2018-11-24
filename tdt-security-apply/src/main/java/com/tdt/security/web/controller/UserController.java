package com.tdt.security.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.tdt.security.dto.User;
import com.tdt.security.dto.UserVo;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: tdt-security
 * @ClassName: UserController
 * @Author: Mr.superbeyone
 * @Time: 2018-11-24 23:03
 * @Description: 用户Controller
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @JsonView(User.UserSimpleView.class)
    public List<User> query(UserVo userVo) {
        ArrayList<User> users = new ArrayList<>();

        System.out.println(ReflectionToStringBuilder.toString(userVo, ToStringStyle.MULTI_LINE_STYLE));
        User user1 = new User("张三", "sun san");
        user1.setPassword("sun");
        User user2 = new User("page", "money");
        user2.setPassword("money");
        User user3 = new User("java", "learn");
        user3.setPassword("java");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }

    @PostMapping
    @JsonView(User.UserSimpleView.class)
    public User create(@RequestBody User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        user.setId(1);
        System.out.println(ReflectionToStringBuilder.toString(user, ToStringStyle.MULTI_LINE_STYLE));
        return user;
    }

    @GetMapping("/{id:\\d+}")
    @JsonView(User.UserDetailView.class)
    public User query(@PathVariable(name = "id") String id) {
        User user = new User();
        user.setUsername("superbeyone");
        user.setPassword("password");
        return user;
    }
}
