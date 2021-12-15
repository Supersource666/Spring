package com.supersource.service.impl;

import com.supersource.dao.IAccountDao;
import com.supersource.domain1.Account;
import com.supersource.service.IAccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Override
    public Account findAccountByUserId(Integer userId) {
        return accountDao.findAccountByUserId(userId);
    }

    @Override
    public void transfer(String sourceUser, String targetUser, float money) {
        System.out.println("transforms......");
        //查询转出账户
        Account source=accountDao.findAccountByUserName(sourceUser);
        //转出账户
        Account target=accountDao.findAccountByUserName(targetUser);
        //转出账户减钱
        source.setUserMoney(source.getUserMoney()-money);
        target.setUserMoney(target.getUserMoney()+money);
        //更新转出账户
        accountDao.updateUser(source);
        int i=1/0;
        accountDao.updateUser(target);
    }
}