package com.domingosuarez.bitso.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Ticker {
  private BigDecimal ask;
  private BigDecimal bid;
  private String book;
  //"created_at": "2017-07-07T07:02:49+00:00",
  @JsonProperty("created_at")
  private String createdAt;
  private BigDecimal high;
  private BigDecimal last;
  private BigDecimal low;
  private BigDecimal volume;
  private BigDecimal vwap;
}
