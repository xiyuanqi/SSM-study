package com.pangding.service.Impl;

import com.pangding.dao.StudentDao;
import com.pangding.pojo.Student;
import com.pangding.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findall() {
        List<Student> students = studentDao.queryAll();
        return students;
    }
}
