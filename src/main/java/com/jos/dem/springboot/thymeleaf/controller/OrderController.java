package com.jos.dem.springboot.thymeleaf.controller;

import com.jos.dem.springboot.thymeleaf.model.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@Controller
public class OrderController {

  @RequestMapping("/")
  public String index(final Model model) {
    model.addAttribute("userDto", new UserDto());
    return "index";
  }

  @RequestMapping(method = POST, value = "search")
  public String search(final UserDto userDto) {
    log.info("zipcode: {}", userDto.getZipCode());
    return "search";
  }
}
