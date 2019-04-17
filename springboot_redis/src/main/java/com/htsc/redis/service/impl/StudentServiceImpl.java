package com.htsc.redis.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.htsc.redis.mapper.StudentMapper;
import com.htsc.redis.model.Student;
import com.htsc.redis.service.StudentServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

/**
 * @Author lvdawei
 * @Date 2019/4/17 15:45
 * @Version 1.0
 */
@Service("studentService")
@CacheConfig(cacheNames ="student",keyGenerator = "wiselyKeyGenerator",cacheManager = "cacheManager")
public class StudentServiceImpl implements StudentServiceI {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    @Cacheable
    public PageInfo<Student> getStudents() {
        PageHelper.startPage(1,1000);
        List<Student> students = studentMapper.getStudents();
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        return pageInfo;
    }
}
