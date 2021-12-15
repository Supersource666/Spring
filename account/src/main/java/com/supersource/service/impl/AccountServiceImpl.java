package com.supersource.service.impl;

import com.supersource.dao.IAccountDao;
import com.supersource.domain1.Account;
import com.supersource.service.IAccountService;

import java.util.List;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

 private IAccountDao accountDao;

 public void setAccountDao(IAccountDao accountDao) {
  this.accountDao = accountDao;
 }

 @Override
 public List<Account> findAllAccount() {
  return accountDao.findAllAccount() ;
 }

 @Override
 public Account findUserById(Integer userId) {
  return accountDao.findUserById(userId);
 }

 @Override
 public void saveUser(Account account) {
    accountDao.saveUser(account);
 }

 @Override
 public void updateUser(Account account) {
   accountDao.updateUser(account);
 }

 @Override
 public void deleteUser(Integer userId) {
  accountDao.deleteUser(userId);
 }


}

