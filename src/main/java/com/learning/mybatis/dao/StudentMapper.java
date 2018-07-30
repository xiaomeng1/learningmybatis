package com.learning.mybatis.dao;

import com.learning.mybatis.entity.Student;

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
}
