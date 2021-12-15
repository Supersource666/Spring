package com.supersource.jdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class jdbcTemplateDemo02 {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");

       JdbcTemplate jt=ac.getBean("jdbcTemplate",JdbcTemplate.class);
//        jt.setDataSource(ds);
      jt.execute("insert into account(userName,userMoney) values ('qianliu','1000')");
    }
}
