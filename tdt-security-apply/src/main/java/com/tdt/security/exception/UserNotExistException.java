package com.tdt.security.exception;

/**
 * @Project: tdt-security
 * @ClassName: UserNotExistException
 * @Author: Mr.superbeyone
 * @Time: 2018-11-25 23:06
 * @Description: 自定义用户表不存在异常
 **/

public class UserNotExistException extends RuntimeException {

    private String id;

    public UserNotExistException(String id) {
        super("user not exist");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
