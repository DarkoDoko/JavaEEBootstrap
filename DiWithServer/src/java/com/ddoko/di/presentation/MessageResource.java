package com.ddoko.di.presentation;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ddoko
 */
@Path("messages")
public class MessageResource {
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Message message() {
       return new Message("hello from message");
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)    
    public JsonObject jsonMessage() {
        return Json.createObjectBuilder().add("content", "duke42").build();
    }
    
}
