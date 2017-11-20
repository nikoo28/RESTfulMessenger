package com.nikoo28.restfulmessenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by nikoo28 on 11/19/17 6:54 PM
 */

// Path defines which class to be accessed when the former is called
@Path("/messages")
public class MessageResource {

  @GET

  // Tells the response format
  @Produces(MediaType.TEXT_PLAIN)
  public String getMessage() {
    return "Hello World";
  }

}
