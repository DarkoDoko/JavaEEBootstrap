package com.ddoko.di.presentation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class Index {
    
    @Inject
    HelloService hs;
    
    @Inject
    UserCounter uc;
    
    @Inject
    GlobalCounter gc;
    
    @PostConstruct
    public void onInit() {
        System.out.println("Creating index");
    }
    
    public String getMessage(){
        uc.increase();
        gc.increase();
        return hs.sayHello();
    }
    
    public int getUserCounter(){
        return uc.getCounter();
    }
    
    public int getGlobalCounter(){
        return gc.getCounter();
    }
    
    @PreDestroy
    public void onDestroy(){
        System.out.println("Destroying index");
    }
}
