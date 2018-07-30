package com.learning.mybatis.entity;

import lombok.Builder;
import lombok.Data;

/**
 * Created by mengxiangli on 2018/7/24.
 */
@Data
@Builder
public class StudentCourse {

    private Integer studentId;

    private Integer courseId;

    private Integer score;
}
