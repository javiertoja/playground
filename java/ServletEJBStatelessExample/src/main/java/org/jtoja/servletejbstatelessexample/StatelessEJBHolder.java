/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jtoja.servletejbstatelessexample;

import javax.ejb.Stateless;

/**
 *
 * @author karels
 */
@Stateless
public class StatelessEJBHolder {
    
    private static final String MSG = "Mensaje Estático del EJB";

    public String getMsg() {
        return MSG;
    }
    
    
}
