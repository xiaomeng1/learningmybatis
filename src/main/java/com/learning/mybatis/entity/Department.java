package com.learning.mybatis.entity;

import lombok.Data;

import java.util.List;

/**
 * Created by mengxiangli on 2018/7/30.
 */
@Data
public class Department {

    private Integer deptno;

    private String dname;

    private String loc;

    private List<Employee> employeeList;
}
