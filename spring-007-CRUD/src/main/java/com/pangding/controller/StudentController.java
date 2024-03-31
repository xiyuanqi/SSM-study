package com.pangding.controller;

import com.pangding.pojo.Student;
import com.pangding.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void findall(){
        List<Student> findall = studentService.findall();
        System.out.println("最终学员数据"+findall);
    }
}
