package com.ddoko.di.presentation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ddoko
 */
public class MessageArchiver {
    
    @PersistenceContext
    EntityManager em;
    
    public void save(String message){
        em.merge(new Message(message));
    }
    
}
