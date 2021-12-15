package com.supersource.jdbcTemplate;

import com.supersource.domain1.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * JDBC的CRUD操作
 */
public class jdbcTemplateDemo03 {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");

       JdbcTemplate jt=ac.getBean("jdbcTemplate",JdbcTemplate.class);

      //jt.execute("insert into account(userName,userMoney) values ('qianliu','1000')");
        //1.执行操作
        //保存
//        jt.update("insert into account(userName,userMoney) values (?,?)","zhaoqi",1000);
        //更新
        //jt.update("update account set userName=?,userMoney=? where userId=? ","zhangwu",1000,1);
        //删除
        jt.update("delete from account where userId=? ",7);
        //查询所有new RowMapper()
//        List<Account> accounts=jt.query("select * from account where UserMoney=?",new BeanPropertyRowMapper<Account>(Account.class),1000);
//        for(Account account:accounts){
//            System.out.println(account);
//        }
        //查询一个
//        List<Account> accounts=jt.query("select * from account where UserId=?",new BeanPropertyRowMapper<Account>(Account.class),2);
//        System.out.println(accounts.isEmpty()?"没有内容":accounts.get(0));
        //查询返回一行一列
        Long count=jt.queryForObject("select count(*) from account where userMoney>?",long.class,1000);
        System.out.println(count);
    }

}
      class AccountRowMapper implements RowMapper<Account> {

          @Override
          public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
              Account account=new Account();
              account.setUserId(rs.getInt("userId"));
              account.setUserName(rs.getString("userName"));
              account.setUserMoney(rs.getFloat("userMoney"));
              return account;
          }
      }