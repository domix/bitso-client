package com.domingosuarez.bitso.client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SingleTickerResult {
  private Ticker payload;
  private Boolean success;
}
