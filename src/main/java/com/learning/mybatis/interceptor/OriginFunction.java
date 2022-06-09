package com.learning.mybatis.interceptor;

/**
 * Created by mengxiangli on 2022-06-08.
 */
public class OriginFunction  implements Function{

    @Override
    public void function() {
        System.out.println("OriginFunction 原始功能");
    }
}
