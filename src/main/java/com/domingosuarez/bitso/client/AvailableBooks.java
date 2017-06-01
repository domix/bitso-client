package com.domingosuarez.bitso.client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class AvailableBooks {
  private List<Book> payload;
  private Boolean success;
}
