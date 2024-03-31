package com.pangding.spring6.service;

import com.pangding.spring6.dao.UserDao;

public class UserService2 {
    private UserDao userDao;

    public UserService2(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        userDao.insert();
    }
}
