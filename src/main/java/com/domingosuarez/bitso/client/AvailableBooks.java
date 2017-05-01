package com.domingosuarez.bitso.client;

import lombok.Data;

import java.util.List;

@Data
public class AvailableBooks {
  private List<Book> payload;
  private Boolean success;
}
