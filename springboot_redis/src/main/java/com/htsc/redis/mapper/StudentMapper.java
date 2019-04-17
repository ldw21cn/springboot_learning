package com.htsc.redis.mapper;


import com.htsc.redis.model.Student;

import java.util.List;

/**
 * @Author lvdawei
 * @Date 2019/4/17 15:45
 * @Version 1.0
 */
public interface StudentMapper {
    List<Student> getStudents();
}
