package com.ddoko.di.presentation;

import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author ddoko
 */
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@Singleton
public class BigBrother {

    private CopyOnWriteArrayList<String> messageQueue;
    
    @PostConstruct
    public void initialize() {
        this.messageQueue = new CopyOnWriteArrayList<>();
    }
    
    public void gatherEverything(String message) {
        this.messageQueue.add(message);
    }
    
    @Schedule(second = "*/2", minute = "*", hour = "*")
    public void batchAnalyze() {
        System.out.println("Analyzing at: " + new Date());
        
        for(String message : messageQueue){
            System.out.println("-- " + message);
            this.messageQueue.remove(message);
        }
    }
}
