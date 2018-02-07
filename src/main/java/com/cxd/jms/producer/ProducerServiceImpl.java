package com.cxd.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2018/02/06
 * Description:
 */
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    JmsTemplate jmsTemplate;
    //队列模式
    //@Resource(name = "queueDestination")
    //主题模式
    @Resource(name = "topicDestination")
    Destination destination;

    public void sendMessage(final String message) {
        //使用JmsTemplate发送消息
        jmsTemplate.send((Destination) destination, new MessageCreator() {
            //创建一个消息
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                return textMessage;
            }
        });
        System.out.println("发送消息："+message);
    }
}
