package com.nikoo28.restfulmessenger.service;

import com.nikoo28.restfulmessenger.database.DatabaseClass;
import com.nikoo28.restfulmessenger.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by nikoo28 on 11/20/17 2:40 AM
 */

public class MessageService {

  private Map<Long, Message> idMessageMap = DatabaseClass.getIdMessageMap();

  // Just for testing purpose, we initialize with some messages
  public MessageService() {
    idMessageMap.put(1L, new Message(1L, "Hello World", "nikoo28"));
    idMessageMap.put(2L, new Message(2L, "REST in action", "nikoo28"));
  }


  /**
   * Ideally this should connect to your database layer, to fetch all the messages
   *
   * @return - a list of all the messages
   */
  public List<Message> getAllMessages() {

    /**
     * Example:- Pseudo code for hard coded messages
     * Message message1 = new Message(1L, "Hello World", "nikoo28");
     * Message message2 = new Message(2L, "REST in action", "nikoo28");
     *
     * List<Message> messageList = new ArrayList<Message>();
     * messageList.add(message1);
     * messageList.add(message2);
     *
     * return messageList;
     */

    return new ArrayList<Message>(idMessageMap.values());
  }

  public Message getMessage(long id) {
    return idMessageMap.get(id);
  }

  public Message addMessage(Message message) {
    message.setId(idMessageMap.size() + 1);
    idMessageMap.put(message.getId(), message);
    return message;
  }

  public Message updateMessage(Message message) {

    if (message.getId() <= 0)
      return null;

    idMessageMap.put(message.getId(), message);
    return message;
  }

  public Message removeMessage(long id) {
    return idMessageMap.remove(id);
  }

}
