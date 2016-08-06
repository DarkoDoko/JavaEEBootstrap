package com.ddoko.di.presentation;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class Index {
    
    @Inject
    HelloService hs;
    
    public String getMessage(){
        return hs.sayHello();
    }
}
