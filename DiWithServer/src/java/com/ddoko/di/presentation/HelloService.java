package com.ddoko.di.presentation;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless
@Interceptors(MethodCallLogger.class)
public class HelloService {
    
    @PostConstruct
    public void onInit() {
        System.out.println("Creating HelloService(EJB)");
    }
    
    
    @PreDestroy
    public void onDestroy(){
        System.out.println("Destroying ejb");
    }
    
    public String sayHello(){
        return " hi there !" + new Date();
    }
    
}
