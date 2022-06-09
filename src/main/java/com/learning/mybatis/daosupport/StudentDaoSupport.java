package com.learning.mybatis.daosupport;

import com.learning.mybatis.dao.StudentMapper;
import com.learning.mybatis.entity.Student;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mengxiangli on 2022-06-07.
 */
@Repository
public class StudentDaoSupport extends SqlSessionDaoSupport {

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }


    public List<Student> listAll() {
        List<Student> students = getSqlSession().selectList("com.learning.mybatis.dao.StudentMapper.listAll");
        return students;
    }
}
