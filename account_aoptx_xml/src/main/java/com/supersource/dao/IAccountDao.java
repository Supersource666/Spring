package com.supersource.dao;

import com.supersource.domain1.Account;

/**
 * 账户的持久层接口
 */
public interface IAccountDao {
    /**
     * 通过用户Id查询用户
     * @param userId
     * @return
     */
    Account findAccountByUserId(Integer userId);

    /**
     * 更新用户
     * @param account
     */
    void updateUser(Account account);

    /**
     *用户名查询用户
     * @param userName
     * @return
     */
    Account findAccountByUserName(String userName);


}
