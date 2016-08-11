package com.ddoko.di.presentation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class Index {
    
    @Inject
    HelloService hs;
    
    @PostConstruct
    public void onInit() {
        System.out.println("Creating index");
    }
    
    public String getMessage(){
        return hs.sayHello();
    }
    
    @PreDestroy
    public void onDestroy(){
        System.out.println("Destroying index");
    }
}
