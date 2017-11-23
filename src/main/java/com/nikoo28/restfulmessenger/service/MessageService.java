package com.nikoo28.restfulmessenger.service;

import com.nikoo28.restfulmessenger.database.DatabaseClass;
import com.nikoo28.restfulmessenger.model.Message;

import java.util.*;

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

  /**
   * To access all the messages for a particular year
   *
   * @param year
   * @return - list of all the messages
   */
  public List<Message> getMessagesForYear(int year) {

    List<Message> messagesForYear = new ArrayList<Message>();

    Calendar calendar = Calendar.getInstance();
    for (Message message : idMessageMap.values()) {
      calendar.setTime(message.getCreated());
      if (calendar.get(Calendar.YEAR) == year)
        messagesForYear.add(message);
    }

    return messagesForYear;
  }

  /**
   * To support pagination; Get some messages from a starting point
   * And return a list of messages specifying the size
   *
   * @param start - the beginning page
   * @param size  - the length of page
   * @return
   */
  public List<Message> getAllMessagesPaginated(int start, int size) {

    List<Message> messageList = new ArrayList<Message>(idMessageMap.values());

    // Validation
    if (start + size > messageList.size())
      return messageList;
    return messageList.subList(start, start + size);
  }

  public List<Message> getAllPaginatedMessagesForYear(int year, int start, int size) {
    List<Message> messagesForYear = getMessagesForYear(year);
    if (start + size > messagesForYear.size())
      return messagesForYear;

    return messagesForYear.subList(start, start + size);
  }
}
