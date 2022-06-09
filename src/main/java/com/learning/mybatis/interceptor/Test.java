package com.learning.mybatis.interceptor;

/**
 * Created by mengxiangli on 2022-06-08.
 */
public class Test {


    public static void main(String[] args) {
        ExpandOriginFunction expandFunction = new ExpandOriginFunction(new OriginFunction());
        expandFunction.function();



    }
}
