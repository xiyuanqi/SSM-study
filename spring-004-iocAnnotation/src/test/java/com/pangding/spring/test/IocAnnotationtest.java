package com.pangding.spring.test;

import com.pangding.spring.bean.User;
import com.pangding.spring.bean.Vip;
import com.pangding.spring.dao.Student;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocAnnotationtest extends TestCase {

    public void testBeanComponent(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        Vip vipBean = applicationContext.getBean("vip", Vip.class);
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(userBean);
        System.out.println(vipBean);
        System.out.println(student);

    }
}
