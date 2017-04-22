package com.domingosuarez.bitso.client;

import com.bitso.Bitso;
import org.junit.Test;

public class Client {
  @Test
  public void testSomeLibraryMethod() {
    Bitso bitso = new Bitso(null, null);
    bitso.availableBooks().stream().forEach(bookInfo -> {
      try {
        System.out.println(bookInfo.book.name());
      } catch (java.lang.IllegalArgumentException e) {

      }
    });

  }
}
