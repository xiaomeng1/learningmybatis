package com.learning.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by mengxiangli on 2018/7/24.
 */
@Data
public class Student implements Serializable {
    private Integer id;

    private Integer studentId;

    private String name;

    private String city;

    private Integer age;

    private String sex;
}
