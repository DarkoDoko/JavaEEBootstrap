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
    
    @Inject
    EmptyDelegate ed;
    
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
        return ed.getUserCounter();
    }
    
    public int getGlobalCounter(){
        return ed.getGlobalCounter();
    }
    
    @PreDestroy
    public void onDestroy(){
        System.out.println("Destroying index");
    }
}
