package com.ddoko.di.presentation;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 * @author ddoko
 */
@ApplicationScoped
public class EmptyDelegate {
    
    @Inject
    GlobalCounter gc;
    
    @Inject
    UserCounter uc;
    
    public int getUserCounter(){
        return uc.getCounter();
    }
    
    public int getGlobalCounter(){
        return gc.getCounter();
    }
}
