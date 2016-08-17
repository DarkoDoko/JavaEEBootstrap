package com.ddoko.di.presentation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.validation.constraints.Size;

@Model
public class Index {
    
    @Inject
    HelloService hs;
    
    private UserCounter uc;
    
    private GlobalCounter gc;
    
    @Inject
    EmptyDelegate ed;
    
    @Inject
    private NakedObject no;
    
    @Inject
    BigBrother bb;
    
    @Size(min = 2, max = 10)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public Object save(){
        bb.gatherEverything(text);
        return "theend";
    }

    @Inject
    public Index(GlobalCounter gc) {
        this.gc = gc;
    }

    public Index() {
    }

    @Inject
    public void setUc(UserCounter uc) {
        this.uc = uc;
    }
    
    @PostConstruct
    public void onInit() {
        System.out.println("Creating index");
    }
    
    public String getMessage(){
        uc.increase();
        gc.increase();
        no.hello();
        String message = hs.sayHello();
        bb.gatherEverything(message);
        
        return message;
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
