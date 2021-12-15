package com.supersource.dao;

import com.supersource.domain1.Account;

import java.util.List;

/**
 * 账户的持久层接口
 */
public interface IAccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     *查询一个
     * @param userId
     * @return
     */
    Account findUserById(Integer userId);


    /**
     *保存
     * @param account
     */
    void saveUser(Account account);

    /**
     * 更新操作
     * @param account
     */
    void updateUser(Account account);

    /**
     * 删除操作
     * @param userId
     */
   void deleteUser(Integer userId);


}
