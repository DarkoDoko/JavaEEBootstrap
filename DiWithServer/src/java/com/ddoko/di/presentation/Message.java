package com.ddoko.di.presentation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author ddoko
 */
@Entity
public class Message {
    
    @Id
    @GeneratedValue
    private long id;
    
    private String content;

    public Message() {
    }

    public Message(String content) {
        this.content = content;
    }
    
}
