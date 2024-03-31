
import com.pangding.controller.StudentController;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateTest extends TestCase {
    public void testQueryAll(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        StudentController studentController = applicationContext.getBean(StudentController.class);
        studentController.findall();
    }
}
