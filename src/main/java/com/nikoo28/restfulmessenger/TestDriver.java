package com.nikoo28.restfulmessenger;

import java.io.File;

/**
 * Created by nikoo28 on 11/25/17 7:06 AM
 */

public class TestDriver {

  public static void main(String[] args) {

    File uploadFile = new File("/Users/nikoo28/Downloads/data/S001R14.edf");
    int response = HttpRequest.post("http://192.168.0.29:8080/RESTfulMessenger/restapi/upload").send(uploadFile).code();
    System.out.println(response);

    HttpRequest request = HttpRequest.post("http://192.168.0.29:8080/RESTfulMessenger/restapi/upload");
    request.part("file", "S001R14.edf", uploadFile);
    if (request.ok())
      System.out.println("Status was updated");
  }

  public static String formatString(String text) {

    StringBuilder json = new StringBuilder();
    String indentString = "";

    for (int i = 0; i < text.length(); i++) {
      char letter = text.charAt(i);
      switch (letter) {
        case '{':
        case '[':
          json.append("\n" + indentString + letter + "\n");
          indentString = indentString + "\t";
          json.append(indentString);
          break;
        case '}':
        case ']':
          indentString = indentString.replaceFirst("\t", "");
          json.append("\n" + indentString + letter);
          break;
        case ',':
          json.append(letter + "\n" + indentString);
          break;

        default:
          json.append(letter);
          break;
      }
    }

    return json.toString();
  }

}
