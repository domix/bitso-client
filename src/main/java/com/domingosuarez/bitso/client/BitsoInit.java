package com.domingosuarez.bitso.client;

import retrofit2.Retrofit;
import retrofit2.adapter.java8.Java8CallAdapterFactory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class BitsoInit {

  public Bitso init(String baseUrl) {
    Retrofit retrofit = new Retrofit.Builder()
      .baseUrl(baseUrl)
      .addConverterFactory(JacksonConverterFactory.create())
      .addCallAdapterFactory(Java8CallAdapterFactory.create())
      .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
      .build();

    return retrofit.create(Bitso.class);
  }
}
