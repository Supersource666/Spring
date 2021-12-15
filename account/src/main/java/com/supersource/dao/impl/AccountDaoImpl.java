package com.supersource.dao.impl;

import com.supersource.dao.IAccountDao;
import com.supersource.domain1.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class AccountDaoImpl implements IAccountDao {
    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    private QueryRunner runner;
    @Override
    public List<Account> findAllAccount() {
        try {
            return runner.query("select* from account",new BeanListHandler<Account>(Account.class));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account findUserById(Integer userId) {
        try {
            return runner.query("select* from account where userId=?",new BeanHandler<Account>(Account.class),userId);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public void saveUser(Account account) {
        try {
            runner.update("insert into account(userName,userMoney) values(?,?)",account.getUserName(),account.getUserMoney());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateUser(Account account) {
        try {
            runner.update("update account set userName=?, userMoney=? where userId=?",account.getUserName(),account.getUserMoney(),account.getUserId());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteUser(Integer userId) {
        try {
            runner.update("delete from account where userId=?",userId);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
