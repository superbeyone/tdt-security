package com.tdt.security.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.tdt.security.pojo.User;
import com.tdt.security.pojo.UserVo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    @ApiOperation(value = "数据查询服务")
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
    public User create(@Valid User user, BindingResult errors) {

        if (errors.hasErrors()) {
            errors.getAllErrors().stream().forEach(error -> System.out.println(error.getDefaultMessage()));
        }
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        user.setUsername("superbeyone");
        user.setPassword("password");
        user.setId("1");
        System.out.println(ReflectionToStringBuilder.toString(user, ToStringStyle.MULTI_LINE_STYLE));
        return user;
    }

    @GetMapping("/{id:\\d+}")
    @JsonView(User.UserDetailView.class)
    public User query(@PathVariable(name = "id") @ApiParam(value = "用户主键id") String id) {
//        throw new UserNotExistException(id);
        System.out.println("查询user信息");
        User user = new User();
        user.setUsername("superbeyone");
        user.setPassword("password");
        return user;
    }

    @PutMapping("/{id:\\d+}")
    public User update(@Valid User user, BindingResult errors) {
        System.out.println("userId:\t" + user.getId());
        if (errors.hasErrors()) {
            errors.getAllErrors().stream().forEach(error -> {
                FieldError fieldError = (FieldError) error;
                System.out.println("fieldError:\t" + fieldError.getDefaultMessage());
                System.out.println(error.getDefaultMessage());
            });
        }
        return user;
    }

    @DeleteMapping("{id:\\d+}")
    public void delete(User user) {
        System.out.println(user.getId());
    }
}
