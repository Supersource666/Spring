package com.supersource.jdbcTemplate;

import com.supersource.dao.IAccountDao;
import com.supersource.domain1.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class jdbcTemplateDemo04 {
    public static void main(String[] args) {
        //获取容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //获取对象
        IAccountDao accountdao=ac.getBean("accountDao",IAccountDao.class);
        //通过用户ID查询用户
       Account account=accountdao.findAccountByUserId(3);
        System.out.println(account);
        //更新操作
        account.setUserMoney(2000f);
        accountdao.updateUser(account);
        System.out.println(account);





    }
}
