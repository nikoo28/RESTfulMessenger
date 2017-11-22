package com.nikoo28.restfulmessenger.resources;

import com.nikoo28.restfulmessenger.model.Message;
import com.nikoo28.restfulmessenger.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by nikoo28 on 11/19/17 6:54 PM
 */

// Path defines which class to be accessed when the former is called
@Path("/messages")
public class MessageResource {

  MessageService messageService = new MessageService();

  @GET
  // Tells the response format
  @Produces(MediaType.APPLICATION_JSON)
  public List<Message> getMessage() {
    return messageService.getAllMessages();
  }

  @GET
  // Adding a subsequent path
  @Path("/test")
  @Produces(MediaType.TEXT_PLAIN)
  public String tt() {
    return "Test";
  }

  @GET
  @Path("/{messageId}")
  @Produces(MediaType.APPLICATION_JSON)
  public Message getMessage(@PathParam("messageId") long messageId) {
    return messageService.getMessage(messageId);
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Message postMessage(Message message) {
    return messageService.addMessage(message);
  }

  @PUT
  @Path("/{messageId}")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Message updateMessage(@PathParam("messageId") long messageId, Message message) {
    message.setId(messageId);
    return messageService.updateMessage(message);
  }

  @DELETE
  @Path("/{messageId}")
  @Produces(MediaType.APPLICATION_JSON)
  public void updateMessage(@PathParam("messageId") long messageId) {
    messageService.removeMessage(messageId);
  }

}
