package com.domingosuarez.bitso.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Setter
@Getter
@ToString
public class Book {
  @JsonProperty("book")
  private String name;
  @JsonProperty("maximum_amount")
  private BigDecimal maxAmount;
  @JsonProperty("maximum_price")
  private BigDecimal maxPrice;
  @JsonProperty("maximum_value")
  private BigDecimal maxValue;
  @JsonProperty("minimum_amount")
  private BigDecimal minAmount;
  @JsonProperty("minimum_price")
  private BigDecimal minPrice;
  @JsonProperty("minimum_value")
  private BigDecimal minValue;
}
