/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jtoja;

import javax.ejb.Local;

/**
 *
 * @author karels
 */
@Local
public interface TopicMessageSenderLocal {

    void sendMessage();
    
}
