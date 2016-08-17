package com.ddoko.di.presentation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ddoko
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
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
