package com.supersource.dao.impl;

import com.supersource.dao.IAccountDao;
import com.supersource.domain1.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    private JdbcTemplate jdbcTemplate;
    @Override
    public Account findAccountByUserId(Integer userId) {
         List<Account> accounts=getJdbcTemplate().query("select* from account where userId=?",new BeanPropertyRowMapper<Account>(Account.class),userId);
        return accounts.isEmpty()?null:accounts.get(0);
    }

    /**
     * 用户名查询用户
     * @param userName
     * @return
     */
    @Override
    public Account findAccountByUserName(String userName) {
        List<Account> accounts=getJdbcTemplate().query("select* from account where userName=?",new BeanPropertyRowMapper<Account>(Account.class),userName);
        if(accounts.isEmpty()){
            return null;
        }
        if(accounts.size()>1){
            throw new RuntimeException("结果集不唯一");
        }
        return accounts.get(0);
    }
//"未查询到对应用户"

    /**
     * 更新用户
     * @param account
     */
    @Override
    public void updateUser(Account account) {
        getJdbcTemplate().update("update account set userName=?,userMoney=? where userId=?",account.getUserName(),account.getUserMoney(100f),account.getUserId());
    }


}
