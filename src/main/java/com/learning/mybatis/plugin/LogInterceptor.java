package com.learning.mybatis.plugin;

import org.apache.ibatis.executor.statement.PreparedStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import java.sql.Statement;
import java.util.Properties;

/**
 * Created by mengxiangli on 2018/9/14.
 * mybatis 日志打印
 */
@Intercepts({@Signature(type = StatementHandler.class,//要拦截的对象
        method = "query",//要拦截的方法
        args = {Statement.class, ResultHandler.class}//方法参数
)})
public class LogInterceptor implements Interceptor {

    private static final Logger log = Logger.getLogger(LogInterceptor.class);

    public Object intercept(Invocation invocation) throws Throwable {
        log.debug("调用方法前进行打印");
        Object proceed = invocation.proceed();
        log.debug("调用方法后进行打印");
        return proceed;
    }

    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    public void setProperties(Properties properties) {
        log.debug("进行初始化数据 data={}" + properties.toString());
    }
}
