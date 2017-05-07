package com.domingosuarez.bitso.client;

import lombok.Data;

@Data
public class SingleTickerResult {
  private Ticker payload;
  private Boolean success;
}
