package com.jos.dem.springboot.thymeleaf.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import com.jos.dem.springboot.thymeleaf.model.ItemDto;
import com.jos.dem.springboot.thymeleaf.model.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    log.info("input: {}", userDto);
    return "search";
  }

  @RequestMapping("/entrees")
  public String entrees() {
    return "allEntrees";
  }

  @RequestMapping("/checkout")
  public String checkout(@RequestParam("item") String name, final Model model) {
    log.info("Item: {}", name);
    ItemDto itemDto = new ItemDto(name);
    model.addAttribute(itemDto);
    return "checkout";
  }
}
