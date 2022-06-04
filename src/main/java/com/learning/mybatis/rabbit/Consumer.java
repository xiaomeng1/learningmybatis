package com.learning.mybatis.rabbit;

import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * @Author xiangli.meng
 * @create 2022/6/1 19:24
 */
public class Consumer {

    //消费者消费消息
    public static void main(String[] args) throws Exception {
        //获取连接和通道
        Connection connection = ConnectionUtil.getConnection();
        final Channel channel = connection.createChannel();
        //声明通道
//        channel.queueDeclare("xiaomeng",false,false,false,null);
        //定义消费者

        //监听队列
        channel.basicConsume("xiaomeng", false, new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("------------ consumer message -----------");
                System.out.println("body：" + new String(body));

                // 休眠两秒钟 ， 使效果更明显
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if ((Integer) (properties.getHeaders().get("num")) == 0) {
                    // multiple-批量处理为false ， 重回队列为true
                    channel.basicNack(envelope.getDeliveryTag(), false, true);
                } else {
                    // multiple-批量处理为false
                    channel.basicAck(envelope.getDeliveryTag(), false);
                }

            }
        });
    }

}
