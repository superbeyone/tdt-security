package com.tdt.security.dto;

/**
 * @Project: tdt-security
 * @ClassName: UserVo
 * @Author: Mr.superbeyone
 * @Time: 2018-11-24 23:31
 * @Description: User查询结果封装
 **/

public class UserVo {
    private String username;
    private String email;

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
}
