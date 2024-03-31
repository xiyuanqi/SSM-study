import com.pangding.bank.service.AccountService;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SMTest extends TestCase {
    public void testSM(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService bean = applicationContext.getBean(AccountService.class);
        try {
            bean.transfer("act001","act002",10000);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
