package com.jos.dem.springboot.thymeleaf.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto implements DomainTransferObject {
  private String zipCode;
  private String city;
  private String state;
}
