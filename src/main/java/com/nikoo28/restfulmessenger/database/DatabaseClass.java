package com.nikoo28.restfulmessenger.database;

import com.nikoo28.restfulmessenger.model.Message;
import com.nikoo28.restfulmessenger.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nikoo28 on 11/20/17 4:34 AM
 */

// Made public and static so that any class in the app has access to these resources
// Is a JDBC or Hibernate class to connect to the the DB
public class DatabaseClass {

  private static Map<Long, Profile> idProfileMap = new HashMap<Long, Profile>();
  private static Map<Long, Message> idMessageMap = new HashMap<Long, Message>();

  public static Map<Long, Profile> getIdProfileMap() {
    return idProfileMap;
  }

  public static Map<Long, Message> getIdMessageMap() {
    return idMessageMap;
  }
}
