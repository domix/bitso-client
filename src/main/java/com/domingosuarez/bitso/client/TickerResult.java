package com.domingosuarez.bitso.client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class TickerResult {
  private List<Ticker> payload;
  private Boolean success;
}
