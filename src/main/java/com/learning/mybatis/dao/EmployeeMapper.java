package com.learning.mybatis.dao;

import com.learning.mybatis.entity.Employee;

import java.util.List;

/**
 * Created by mengxiangli on 2018/7/30.
 */
public interface EmployeeMapper {

    /**
     * 获取雇员信息
     * @param id
     * @return
     */
    Employee load(Integer id);

    /**
     * 根据部门id获取雇员信息
     * @param id
     * @return
     */
    List<Employee> loadByDeptId(Integer id);
}
