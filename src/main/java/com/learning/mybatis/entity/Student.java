package com.learning.mybatis.entity;

import lombok.Builder;
import lombok.Data;

/**
 * Created by mengxiangli on 2018/7/24.
 */
@Data
@Builder
public class Student {
    private Integer studentId;

    private String name;

    private String city;

    private Integer age;
}
