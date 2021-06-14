package com.jos.dem.springboot.thymeleaf.controller;

import com.jos.dem.springboot.thymeleaf.model.ItemDto;
import com.jos.dem.springboot.thymeleaf.model.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Mono;

@Slf4j
@Controller
public class OrderController {

  @GetMapping("/")
  public Mono<String> index(final Model model) {
    model.addAttribute("userDto", new UserDto());
    return Mono.just("index");
  }

  @PostMapping(value = "search")
  public Mono<String> search(final UserDto userDto) {
    log.info("input: {}", userDto);
    return Mono.just("search");
  }

  @GetMapping("/entrees")
  public Mono<String> entrees() {
    return Mono.just("allEntrees");
  }

  @GetMapping("/checkout")
  public Mono<String> checkout(@RequestParam("item") String name, final Model model) {
    log.info("Item: {}", name);
    ItemDto itemDto = new ItemDto(name);
    model.addAttribute(itemDto);
    return Mono.just("checkout");
  }
}
