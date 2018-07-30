package com.learning.mybatis.test;

import com.learning.mybatis.dao.DeptMapper;
import com.learning.mybatis.dao.EmployeeMapper;
import com.learning.mybatis.dao.StudentMapper;
import com.learning.mybatis.entity.Department;
import com.learning.mybatis.entity.Employee;
import com.learning.mybatis.entity.Student;
import com.learning.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mengxiangli on 2018/7/27.
 */
public class DaoTest {

    @Test
    public void loadStudent() {
        SqlSession sqlSession = MybatisUtil.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        Student load = mapper.load(1);
        System.out.println(load);
        //断言不为空，符合断言不做任何操作
        Assert.assertFalse("结果为空", load == null);
    }


    @Test
    public void loadEmployee() {
        SqlSession sqlSession = MybatisUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = mapper.load(7369);
        Assert.assertNotNull(employee);
    }


    @Test
    public void loadDept() {
        SqlSession sqlSession = MybatisUtil.openSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);

        Department department = mapper.load(10);
        Assert.assertNotNull(department);
    }
}
