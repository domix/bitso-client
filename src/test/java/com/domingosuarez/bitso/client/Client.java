package com.domingosuarez.bitso.client;

import org.junit.BeforeClass;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

import static com.domingosuarez.bitso.client.Bitso.BASEURL_V3;
import static org.junit.Assert.assertNotNull;

public class Client {
  private static final String NULL_BODY = "No se pudo obtener el body";

  private static Bitso bitso;

  @BeforeClass
  public static void setup() {
    bitso = new BitsoInit()
      .init(BASEURL_V3);
  }

  @Test
  public void testAvailableBooks() throws IOException {
    Call<AvailableBooks> availableBooksCall = bitso.availableBooks();
    Response<AvailableBooks> response = availableBooksCall.execute();
    AvailableBooks body = response.body();

    assertNotNull(NULL_BODY, body);
  }

  @Test
  public void testTicker() throws IOException {
    Call<TickerResult> ticker = bitso.ticker();
    Response<TickerResult> response = ticker.execute();
    TickerResult body = response.body();

    assertNotNull(NULL_BODY, body);
  }

  @Test
  public void testSingleTicker() throws IOException {
    Call<SingleTickerResult> xrp_btc = bitso.tickerByBook("xrp_btc");
    Response<SingleTickerResult> response = xrp_btc.execute();
    SingleTickerResult body = response.body();

    assertNotNull(NULL_BODY, body);
  }
}
