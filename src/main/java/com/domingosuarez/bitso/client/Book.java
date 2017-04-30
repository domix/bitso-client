package com.domingosuarez.bitso.client;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Book {
  private String name;
  private BigDecimal maxAmount;
  private BigDecimal maxPrice;
  private BigDecimal maxValue;
  private BigDecimal minAmount;
  private BigDecimal minPrice;
  private BigDecimal minValue;
}
