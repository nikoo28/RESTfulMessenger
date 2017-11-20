package com.nikoo28.restfulmessenger.service;

import com.nikoo28.restfulmessenger.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 11/20/17 2:40 AM
 */

public class MessageService {

  /**
   * Ideally this should connect to your database layer, to fetch all the messages
   * @return - a list of all the messages
   */
  public List<Message> getAllMessages() {

    Message message1 = new Message(1L, "Hello World", "nikoo28");
    Message message2 = new Message(2L, "REST in action", "nikoo28");

    List<Message> messageList = new ArrayList<Message>();
    messageList.add(message1);
    messageList.add(message2);

    return messageList;
  }

}
