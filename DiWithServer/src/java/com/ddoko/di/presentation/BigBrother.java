package com.ddoko.di.presentation;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

/**
 *
 * @author ddoko
 */
@Stateless
public class BigBrother {
    
    @Asynchronous
    public void gatherEverything(String message){
        System.out.println("Save it for later: " + message);
        
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            Logger.getLogger(BigBrother.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
