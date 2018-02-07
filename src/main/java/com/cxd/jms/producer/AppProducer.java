package com.cxd.jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2018/02/06
 * Description:
 */
public class AppProducer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for (int i = 0; i <100 ; i++) {
            service.sendMessage("test"+i);
        }
        context.close();
    }
}
