package com.nikoo28.restfulmessenger.resources;

import com.nikoo28.restfulmessenger.model.Message;
import com.nikoo28.restfulmessenger.service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
  @Produces(MediaType.APPLICATION_XML)
  public List<Message> getMessage() {
    return messageService.getAllMessages();
  }

}
