package com.domingosuarez.bitso.client;

import org.junit.Test;
import retrofit2.Call;

import java.io.IOException;

public class Client {
  @Test
  public void testSomeLibraryMethod() throws IOException {
    Bitso bitso = new BitsoInit()
      .init("https://api.bitso.com/v3/");

    Call<AvailableBooks> availableBooksCall = bitso.availableBooks();

    AvailableBooks body = availableBooksCall.execute().body();

    body.getPayload().forEach(System.out::println);
  }
}
