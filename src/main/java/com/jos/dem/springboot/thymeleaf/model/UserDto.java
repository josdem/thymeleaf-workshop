package com.jos.dem.springboot.thymeleaf.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto implements DomainTransferObject {
  private String zipCode;
}
