package com.learning.mybatis.dao;

import com.learning.mybatis.entity.FemaleStudentHealth;
import com.learning.mybatis.entity.MaleStudentHealth;

/**
 * Created by mengxiangli on 2018/7/31.
 */
public interface StudentHealthMapper {

    /**
     * 获取女学生健康明细
     *
     * @param studentId
     * @return
     */
    FemaleStudentHealth loadFemaleStudentHealth(Integer studentId);


    /**
     * 获取男学生健康明细
     *
     * @param studentId
     * @return
     */
    MaleStudentHealth loadMaleStudentHealth(Integer studentId);
}
