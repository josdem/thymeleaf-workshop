package com.jos.dem.springboot.thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ItemDto implements DomainTransferObject {
  private String name;
}
