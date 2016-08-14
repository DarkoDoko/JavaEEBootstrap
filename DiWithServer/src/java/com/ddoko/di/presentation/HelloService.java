package com.ddoko.di.presentation;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless
@Interceptors(MethodCallLogger.class)
public class HelloService {
    
    @Resource
    SessionContext sc;
    
    @PostConstruct
    public void onInit() {
        System.out.println("Creating HelloService(EJB)");
    }
    
    
    @PreDestroy
    public void onDestroy(){
        System.out.println("Destroying ejb");
    }
    
    public String sayHello(){
        return " hi there !" + new Date() + " " + sc.getCallerPrincipal();
    }
    
}
