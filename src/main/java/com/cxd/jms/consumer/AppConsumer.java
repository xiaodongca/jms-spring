package com.cxd.jms.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2018/02/06
 * Description:
 */
public class AppConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

    }


}
