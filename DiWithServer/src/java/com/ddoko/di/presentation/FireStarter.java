package com.ddoko.di.presentation;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author ddoko
 */
@Startup
@Singleton
public class FireStarter {
    
    @PostConstruct
    public void onStart() {
        System.out.println("FireStarter is starting");
    }
}
