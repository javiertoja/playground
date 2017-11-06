/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jtoja.servletejbstatelessexample;

import javax.ejb.Stateful;

/**
 *
 * @author karels
 */
@Stateful
public class StatefulLocalEJBCounter {
    
    private int counter;

    public void addToCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
    
    
}
