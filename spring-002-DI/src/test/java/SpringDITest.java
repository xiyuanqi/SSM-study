import com.pangding.spring6.dao.Dog;
import com.pangding.spring6.dao.People;
import com.pangding.spring6.service.UserService;
import com.pangding.spring6.service.UserService2;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest extends TestCase {

    public void testPeop(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        People peopleBean = applicationContext.getBean("peopleBean", People.class);
        System.out.println(peopleBean);
    }

    public void testC(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-c.xml");
        People peopleBean = applicationContext.getBean("peopleBean", People.class);
        System.out.println(peopleBean);

    }
    public void testDog(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Dog dog = applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dog);
    }

    public void testP(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dog = applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dog);
    }

    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.saveUser();
    }

    public void testConstructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        UserService2 userService2Bean = applicationContext.getBean("UserService2Bean", UserService2.class);
        userService2Bean.save();

    }
}
