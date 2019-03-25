package com.vargur.fwwbase.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
  private static Logger log = LogManager.getLogger(RootController.class);
  @RequestMapping("/")
  public String index() {
    log.info("HI");
      return "Greetings from Spring Boot!";
  }
}
