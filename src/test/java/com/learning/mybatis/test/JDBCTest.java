package com.learning.mybatis.test;

import lombok.SneakyThrows;
import org.junit.Test;

import java.sql.*;

/**
 * @Author xiangli.meng
 * @create 2022/5/31 7:02
 */
public class JDBCTest {

    @SneakyThrows
    @Test
    public void testJdbc(){
        Class<?> forName = Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://124.220.31.245:3306/xiaomeg", "xiaomeng", "MxlFnn1314520.");

        PreparedStatement statement = connection.prepareStatement("select * from student");
        boolean execute = statement.execute();
        System.out.println(execute);

        ResultSet resultSet = statement.getResultSet();
        ResultSetMetaData metaData = statement.getMetaData();
        int columnCount = metaData.getColumnCount();

        for (int i=1;i<=columnCount;i++) {
            System.out.println("field name:" + metaData.getColumnName(i) + "  jdbc type:" + metaData.getColumnType(i));
        }

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
        }
    }
}
