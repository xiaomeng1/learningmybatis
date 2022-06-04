package com.learning.mybatis.entity;

import lombok.Builder;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * Created by mengxiangli on 2018/7/24.
 */
@Alias("course")
@Data
@Builder
public class Course {

    private Integer courseId;

    private String name;

    private Integer teacherId;
}
