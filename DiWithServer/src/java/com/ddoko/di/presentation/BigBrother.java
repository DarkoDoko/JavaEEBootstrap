package com.ddoko.di.presentation;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedExecutorService;

/**
 *
 * @author ddoko
 */
public class BigBrother {
    
    @Resource
    ManagedExecutorService mes;

    public void gatherEverything(String message) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Save it for later: " + message);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BigBrother.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        mes.execute(runnable);
    }
}
