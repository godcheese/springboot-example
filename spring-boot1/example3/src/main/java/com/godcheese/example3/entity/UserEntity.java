package com.godcheese.example3.entity;

import java.io.Serializable;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2018/4/5 17:43
 */
public class UserEntity implements Serializable {

    private static final long serialVersionUID = -3409576928376521075L;

    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
