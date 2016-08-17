package com.ddoko.di.presentation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author ddoko
 */
@Path("messages")
public class MessageResource {
    
    @GET
    public String message() {
       return "hello, world"; 
    }
    
}
