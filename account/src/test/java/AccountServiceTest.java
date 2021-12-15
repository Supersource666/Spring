//@Runwith()

import com.supersource.domain1.Account;
import com.supersource.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用Junit单元测试配置
 */
public class AccountServiceTest {
    //@Autowired
//private IAccountService as=null;

    /**
     * 查询所有用户
     */
    @Test
    public void testFindAll() {
        //获取容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        IAccountService as=ac.getBean("accountService",IAccountService.class);
        //执行方法
        List<Account> accounts=as.findAllAccount();
        for(Account account:accounts){
            System.out.println(account);
        }

    }

    /**
     * 查找一个
     */
    @Test
    public void findOne() {
        //获取容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        IAccountService as=ac.getBean("accountService",IAccountService.class);
        //执行方法
        Account account=as.findUserById(2);
        System.out.println(account);

    }

    @Test
    public void testSave() {
        Account account=new Account();
        account.setUserName("yourlast");
        account.setUserMoney(13145);
        //获取容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        IAccountService as=ac.getBean("accountService",IAccountService.class);
        //执行方法
        as.saveUser(account);
    }

    @Test
    public void testDelete() {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        IAccountService as=ac.getBean("accountService",IAccountService.class);
        //执行方法
        //Account account=as.findUserById(8);
        as.deleteUser(6);
        as.deleteUser(11);
        List<Account> accounts=as.findAllAccount();
        for(Account account:accounts){
            System.out.println(account);
        }

    }

    @Test
    public void testUpdate() {
        //获取容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        IAccountService as=ac.getBean("accountService",IAccountService.class);
        //执行方法
        Account account=as.findUserById(8);
        account.setUserMoney(1234567f);
        as.updateUser(account);
    }
}
