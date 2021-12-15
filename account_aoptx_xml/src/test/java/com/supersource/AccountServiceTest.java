package com.supersource;

import com.supersource.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:bean.xml")
public class AccountServiceTest {
    @Autowired
    private IAccountService as;

    @Test
    public void testTransfer(){
        as.transfer("zhangwu","wangwu",100f);
        as.findAccountByUserId(1);
        System.out.println( as.findAccountByUserId(1));
        System.out.println( as.findAccountByUserId(3));
    }

}
