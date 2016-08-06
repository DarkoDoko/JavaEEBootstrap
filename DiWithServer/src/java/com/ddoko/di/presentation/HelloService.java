package com.ddoko.di.presentation;

import java.util.Date;
import javax.ejb.Stateless;

@Stateless
public class HelloService {
    public String sayHello(){
        return " hi there !" + new Date();
    }
    
}
