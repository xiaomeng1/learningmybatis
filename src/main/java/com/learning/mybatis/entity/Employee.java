package com.learning.mybatis.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mengxiangli on 2018/7/30.
 */
@Data
public class Employee {

    private Integer empno;

    private String ename;

    private String job;

    private Employee mgr;

    private Date hiredate;

    private Integer sal;

    private Integer comm;

    private Department deptno;
}
