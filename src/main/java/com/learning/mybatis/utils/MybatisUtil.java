package com.learning.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

/**
 * Created by mengxiangli on 2018/7/14.
 */
public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory;
    private static Log logger = LogFactory.getLog(MybatisUtil.class);

    static {
        try {
            Reader reader = Resources.getResourceAsReader("mysql/mybatis-config.xml");
            Properties properties = new Properties();
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader,properties);
        } catch (IOException e) {
            logger.error("初始化配置失败.errorMessage:" + e);
        }
    }


    public static SqlSession openSession() {
        return sqlSessionFactory.openSession();
    }

}
