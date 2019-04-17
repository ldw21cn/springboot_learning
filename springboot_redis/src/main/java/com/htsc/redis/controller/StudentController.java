package com.htsc.redis.controller;


import com.github.pagehelper.PageInfo;
import com.htsc.redis.model.Student;
import com.htsc.redis.service.StudentServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author lvdawei
 * @Date 2019/4/17 15:55
 * @Version 1.0
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentServiceI studentService;

    @GetMapping
    public String getStudent() {
        PageInfo<Student> pageInfo = studentService.getStudents();
        List<Student> studentList = pageInfo.getList();
        return studentList.toString();
    }

}
