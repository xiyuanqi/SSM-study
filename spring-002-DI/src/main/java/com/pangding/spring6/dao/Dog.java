package com.pangding.spring6.dao;


import java.util.Date;

public class Dog {
    private String name;
    private int age;
    private Date birth;
    private People people;

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", people=" + people +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
