package com.supersource.domain1;

import java.io.Serializable;

/**
 * 账户的实体类
 */
public class Account implements Serializable{
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    private Integer userId;
    private String userName;
    private float userMoney;

    public Account() {
    }

    public float getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(float userMoney) {
        this.userMoney = userMoney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userMoney=" + userMoney +
                '}';
    }
}
