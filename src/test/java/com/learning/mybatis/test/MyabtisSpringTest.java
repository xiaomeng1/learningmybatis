package com.learning.mybatis.test;

import com.learning.mybatis.dao.StudentMapper;
import com.learning.mybatis.daosupport.StudentDaoSupport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by mengxiangli on 2022-06-06.
 */
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(value = SpringJUnit4ClassRunner.class)
public class MyabtisSpringTest {

    @Resource
    private StudentMapper studentMapper;

    @Autowired
    private StudentDaoSupport studentDaoSupport;

    @Test
    public void testQuery() {
//        studentMapper.listAll();

        studentDaoSupport.listAll();
    }

}
