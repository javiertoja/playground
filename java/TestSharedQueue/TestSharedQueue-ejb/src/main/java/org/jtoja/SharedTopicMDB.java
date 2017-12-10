/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jtoja;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author karels
 */
@MessageDriven(mappedName = "jms/SharedTopic", activationConfig = {
    @ActivationConfigProperty(propertyName = "clientId", propertyValue = "sharedClientID"),
        @ActivationConfigProperty(propertyName = "subscriptionDurability", propertyValue = "Durable"),
        @ActivationConfigProperty(propertyName = "subscriptionName", propertyValue = "sharedSubscriptionName"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
        //@ActivationConfigProperty(propertyName = "sharedSubscription", propertyValue = "TRUE"),  
        @ActivationConfigProperty(propertyName = "connectionFactoryLookup", propertyValue = "java:comp/DefaultJMSConnectionFactory")
})
public class SharedTopicMDB implements MessageListener {

    public SharedTopicMDB() {
    }

    @Override
    public void onMessage(Message message) {
        try {
            Logger.getLogger(SharedTopicMDB.class.getName()).log(Level.INFO, "\t===>{0}", ((TextMessage)message).getText());
        } catch (JMSException ex) {
            Logger.getLogger(SharedTopicMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
