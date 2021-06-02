package com.jos.dem.springboot.thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ItemDto implements DomainTransferObject {
  private String name;
}
