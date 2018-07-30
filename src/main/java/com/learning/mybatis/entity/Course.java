package com.learning.mybatis.entity;

import lombok.Builder;
import lombok.Data;

/**
 * Created by mengxiangli on 2018/7/24.
 */
@Data
@Builder
public class Course {

    private Integer courseId;

    private String name;

    private Integer teacherId;
}
