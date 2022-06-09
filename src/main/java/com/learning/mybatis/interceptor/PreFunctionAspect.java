package com.learning.mybatis.interceptor;

/**
 * Created by mengxiangli on 2022-06-08.
 */
public class PreFunctionAspect implements Aspect {

    @Override
    public void preAction() {
        System.out.println("PreFunctionAspect  ---  前置处理");
    }
}
