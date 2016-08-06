package com.ddoko.di.presentation;

import java.util.Date;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless
@Interceptors(MethodCallLogger.class)
public class HelloService {
    public String sayHello(){
        return " hi there !" + new Date();
    }
    
}
