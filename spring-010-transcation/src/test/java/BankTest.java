import com.pangding.configuration.springConfiguration;
import com.pangding.service.AccountService;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankTest extends TestCase {
    public void testTransfer(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(springConfiguration.class);
        AccountService accountService = applicationContext.getBean(AccountService.class);
        try {
            accountService.transfer("act001", "act002", 10000);
            System.out.println("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
