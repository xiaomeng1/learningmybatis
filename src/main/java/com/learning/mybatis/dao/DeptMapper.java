package com.learning.mybatis.dao;

import com.learning.mybatis.entity.Department;

/**
 * Created by mengxiangli on 2018/7/30.
 */
public interface DeptMapper {

    /**
     * 根据id获取部门详情
     * @param id
     * @return
     */
    Department load(Integer id);
}
