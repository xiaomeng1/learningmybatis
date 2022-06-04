package com.learning.mybatis.log;

import org.apache.ibatis.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author xiangli.meng
 * @create 2022/6/1 15:09
 */
public class MyMybatisLog implements Log {

    private Logger logger;

    public MyMybatisLog(String logger) {
        this.logger = LoggerFactory.getLogger(logger);
    }

    public boolean isDebugEnabled() {
        return true;
    }

    public boolean isTraceEnabled() {
        return true;
    }

    public void error(String s, Throwable e) {
        logger.error("xiaomeng:" + s);
    }

    public void error(String s) {
        logger.error("xiaomeng:" + s);
    }

    public void debug(String s) {
        logger.debug("xiaomeng:" + s);

    }

    public void trace(String s) {
        logger.trace("xiaomeng:" + s);

    }

    public void warn(String s) {
        logger.warn("xiaomeng:" + s);

    }
}
