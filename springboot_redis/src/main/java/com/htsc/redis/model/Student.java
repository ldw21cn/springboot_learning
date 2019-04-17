package com.htsc.redis.model;


import java.io.Serializable;

/**
 * @Author lvdawei
 * @Date 2019/4/17 15:45
 * @Version 1.0
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -4050050628917506042L;

    private Integer id;

    private String name;

    private String age;

    public Student(Integer id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
