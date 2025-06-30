package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/greet")
  public String greet(@RequestParam(value = "name", defaultValue = "World") String name) {
    return "Hello, " + name + "!";
  }

  @GetMapping("/health")
  public String health() {
    return "OK";
  }
}
