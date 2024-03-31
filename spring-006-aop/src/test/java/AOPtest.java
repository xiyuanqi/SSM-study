import com.pangding.Service.UserService;
import com.pangding.Service.springconfiguration;
import com.pangding.transction.AccountService;
import com.pangding.transction.OrderService;
import com.pangding.transction.configuration;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class AOPtest extends TestCase {
    public void testAspect(){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(springconfiguration.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.recharge();

    }
    public void testTransction(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
        AccountService accountService = applicationContext.getBean(AccountService.class);
        accountService.transfer();
    }
}
