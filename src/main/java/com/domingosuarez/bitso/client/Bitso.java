package com.domingosuarez.bitso.client;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Bitso {
  @GET("available_books")
  Call<AvailableBooks> availableBooks();

  @GET("ticker")
  Call<TickerResult> ticker();

  @GET("ticker")
  Call<SingleTickerResult> tickerByBook(@Query("book") String book);
}
