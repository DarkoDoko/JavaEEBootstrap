package com.ddoko.di.presentation;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ddoko
 */
@Path("messages")
public class MessagesResource {
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("{id}")
    public Message message(@PathParam("id") long id) {
       return new Message("hello from message" + id);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)    
    public JsonObject jsonMessage() {
        return Json.createObjectBuilder().add("content", "duke42").build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(Message message){
        System.out.println("Message: " + message);
    }
    
}
