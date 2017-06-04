package com.domingosuarez.bitso.client;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Bitso {
  String BASEURL_V3 = "https://api.bitso.com/v3/";

  @GET("available_books")
  Call<AvailableBooks> availableBooks();

  @GET("ticker")
  Call<TickerResult> ticker();

  @GET("ticker")
  Call<SingleTickerResult> tickerByBook(@Query("book") String book);
}
