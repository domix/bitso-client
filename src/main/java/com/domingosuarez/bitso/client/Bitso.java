package com.domingosuarez.bitso.client;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Bitso {
  @GET("available_books/")
  Call<AvailableBooks> availableBooks();
}
