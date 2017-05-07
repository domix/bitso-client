package com.domingosuarez.bitso.client;

import lombok.Data;

import java.util.List;

@Data
public class TickerResult {
  private List<Ticker> payload;
  private Boolean success;
}
