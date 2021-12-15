package com.supersource.service;

import com.supersource.domain1.Account;

import java.util.List;

/**
 * 转账业务层的实现接口类
 */
public interface IAccountService {

    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查询一个
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
