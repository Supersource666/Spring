package com.supersource.service;

import com.supersource.domain1.Account;

public interface IAccountService {
    Account findAccountByUserId(Integer userId);

    /**
     * 转账的业务实现
     * @param sourceUser
     * @param targetUser
     * @param money
     */
    void transfer(String sourceUser,String targetUser,float money);
}
