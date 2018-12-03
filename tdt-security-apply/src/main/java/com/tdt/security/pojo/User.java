package com.tdt.security.pojo;

import com.fasterxml.jackson.annotation.JsonView;
import com.tdt.security.validator.MyConstraint;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @Project: tdt-security
 * @ClassName: User
 * @Author: Mr.superbeyone
 * @Time: 2018-11-24 23:05
 * @Description: User实体
 **/

public class User {

    public interface UserSimpleView {
    }

    ;

    public interface UserDetailView extends UserSimpleView {
    }

    ;
    @NotBlank
    private String id;
    @MyConstraint(message = "这是一个测试")
    private String mobile;
    private String email;
    @NotBlank
    private String password;

    @Past
    private Date birthday;

    public User() {
    }

    public User(String mobile, String email) {
        this.mobile = mobile;
        this.email = email;
    }

    @JsonView(UserSimpleView.class)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonView(UserSimpleView.class)
    public String getmobile() {
        return mobile;
    }

    public void setmobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    @JsonView(UserDetailView.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
