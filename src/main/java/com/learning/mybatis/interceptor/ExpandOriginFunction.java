package com.learning.mybatis.interceptor;

/**
 * Created by mengxiangli on 2022-06-08.
 */
public class ExpandOriginFunction implements Function {

    private OriginFunction originFunction;

    public ExpandOriginFunction(OriginFunction originFunction) {
        this.originFunction = originFunction;
    }

    @Override
    public void function() {
        //前置处理
        AspectChain.preAll();
        //执行具体功能
        originFunction.function();
    }
}
