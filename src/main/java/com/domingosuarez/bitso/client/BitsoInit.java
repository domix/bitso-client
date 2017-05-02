package com.domingosuarez.bitso.client;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class BitsoInit {

  public Bitso init(String baseUrl) {
    Retrofit retrofit = new Retrofit.Builder()
      .baseUrl(baseUrl)
      .addConverterFactory(
        JacksonConverterFactory.create()
      )
      .build();

    return retrofit.create(Bitso.class);
  }
}
