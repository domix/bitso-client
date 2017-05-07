package com.domingosuarez.bitso.client;

import org.junit.BeforeClass;
import org.junit.Test;
import retrofit2.Call;

import java.io.IOException;

public class Client {
  private static Bitso bitso;

  @BeforeClass
  public static void setup() {
    bitso = new BitsoInit()
      .init("https://api.bitso.com/v3/");
  }

  @Test
  public void testAvailableBooks() throws IOException {
    Call<AvailableBooks> availableBooksCall = bitso.availableBooks();
    AvailableBooks body = availableBooksCall.execute().body();

    body.getPayload().forEach(System.out::println);
  }

  @Test
  public void testTicker() throws IOException {
    Call<TickerResult> ticker = bitso.ticker();
    TickerResult body = ticker.execute().body();

    System.out.println(body.toString());
  }

  @Test
  public void testSingleTicker() throws IOException {
    Call<SingleTickerResult> xrp_btc = bitso.tickerByBook("xrp_btc");
    SingleTickerResult body = xrp_btc.execute().body();

    System.out.println(body.toString());
  }
}
