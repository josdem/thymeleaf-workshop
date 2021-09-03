package com.jos.dem.springboot.thymeleaf.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UserDto implements DomainTransferObject {
  private String zipCode;
  private String city;
  private String state;
}
