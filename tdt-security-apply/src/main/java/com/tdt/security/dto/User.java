package com.tdt.security.dto;

import com.fasterxml.jackson.annotation.JsonView;

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
    private Integer id;
    private String username;
    private String email;
    private String password;


    public User() {
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @JsonView(UserSimpleView.class)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @JsonView(UserSimpleView.class)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
