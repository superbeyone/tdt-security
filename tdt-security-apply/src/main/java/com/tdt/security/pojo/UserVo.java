package com.tdt.security.pojo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Project: tdt-security
 * @ClassName: UserVo
 * @Author: Mr.superbeyone
 * @Time: 2018-11-24 23:31
 * @Description: User查询结果封装
 **/

public class UserVo {
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "用户邮箱")
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
