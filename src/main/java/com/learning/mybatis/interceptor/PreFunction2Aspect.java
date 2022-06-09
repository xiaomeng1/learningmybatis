package com.learning.mybatis.interceptor;

/**
 * Created by mengxiangli on 2022-06-08.
 */
public class PreFunction2Aspect implements Aspect {
    @Override
    public void preAction() {
        System.out.println("PreFunction2Aspect ");
    }
}
