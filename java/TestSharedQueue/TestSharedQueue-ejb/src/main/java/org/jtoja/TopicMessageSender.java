/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jtoja;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.JMSContext;
import javax.jms.Topic;

/**
 *
 * @author karels
 */
@Stateless
public class TopicMessageSender implements TopicMessageSenderLocal {
    
    @Resource(lookup = "jms/SharedTopic")
    Topic topic;
    
    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    ConnectionFactory tpFactory;
    
    @Override
    public void sendMessage() {
        
        try(JMSContext jmsCtx = tpFactory.createContext(JMSContext.AUTO_ACKNOWLEDGE)){
        
            jmsCtx.createProducer().setDeliveryMode(DeliveryMode.PERSISTENT).send(topic, jmsCtx.createTextMessage("Texto de prueba !"));
        }
    }
    
    
}
