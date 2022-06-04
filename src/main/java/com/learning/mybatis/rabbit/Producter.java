package com.learning.mybatis.rabbit;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xiangli.meng
 * @create 2022/6/1 19:16
 */
public class Producter {


    //创建队列，发送消息
    public static void main(String[] args) throws Exception {
        //获取连接
        Connection connection = ConnectionUtil.getConnection();
        //创建通道
        Channel channel = connection.createChannel();
        //声明创建队列
//        channel.queueDeclare("xiaomeng",false,false,false,null);
        //消息内容
        // 4 发送消息
        for (int i = 0; i < 5; i++) {
            Map<String, Object> header = new HashMap<String, Object>();
            header.put("num", i);

            AMQP.BasicProperties properties = new AMQP.BasicProperties.Builder()
                    .deliveryMode(2)
                    .contentEncoding("UTF-8")
                    .headers(header)
                    .build();

            String msg = "RabbitMQ: 重回队列 message" + i;
            channel.basicPublish("", "xiaomeng", properties, msg.getBytes());
        }

        //关闭连接和通道
        channel.close();
        connection.close();
    }

}
