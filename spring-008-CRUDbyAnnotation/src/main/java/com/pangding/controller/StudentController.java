package com.pangding.controller;

import com.pangding.pojo.Student;
import com.pangding.service.StudentService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller("studentController")
public class StudentController {
    @Resource
    private StudentService studentService;

    public void findall(){
        List<Student> findall = studentService.findall();
        System.out.println("最终学员数据"+findall);
    }
}
