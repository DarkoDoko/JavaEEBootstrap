package com.ddoko.di.presentation;

import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Schedule;
import javax.ejb.ScheduleExpression;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;

/**
 *
 * @author ddoko
 */
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@Singleton
public class BigBrother {

    private CopyOnWriteArrayList<String> messageQueue;
    
    @Resource
    TimerService ts;
    
    private Timer timer;
    
    @PostConstruct
    public void initialize() {
        this.messageQueue = new CopyOnWriteArrayList<>();
        ScheduleExpression se = new ScheduleExpression();
        se.minute("*").hour("*").second("*/5");
        this.timer = ts.createCalendarTimer(se);
    }
    
    public void gatherEverything(String message) {
        this.messageQueue.add(message);
    }
    
    @Timeout
    public void batchAnalyze() {
        System.out.println("Analyzing at: " + new Date());
        
        for(String message : messageQueue){
            System.out.println("-- " + message);
            this.messageQueue.remove(message);
        }
    }
}
