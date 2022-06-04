package com.learning.mybatis.dao;

import com.learning.mybatis.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by mengxiangli on 2018/7/25.
 */
public interface StudentMapper {

    /**
     * 根据id获取学生信息
     * @param studentId 学生id
     * @return
     */
    Student load(Integer studentId);

    /**
     * 连表进行查询学生信息
     * @param studentId
     * @return
     */
    Student loadMapping(Integer studentId);

    /**
     * 插入学生信息
     * @param student
     * @return
     */
    Integer insert(Student student);


    /**
     * 删除
     * @param studentId
     * @return
     */
    Integer delete(Integer studentId);

    @Select("select * from student")
    List<Student> listAll();
}
