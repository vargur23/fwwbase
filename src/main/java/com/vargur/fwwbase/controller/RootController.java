package com.vargur.fwwbase.controller;

import com.vargur.fwwbase.data.repository.item.PistolsRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
  private static Logger log = LogManager.getLogger(RootController.class);

  @Autowired
  PistolsRepository pistolsRepository;

  @RequestMapping("/")
  public String index() {
    log.info("Root");
    return "Greetings from Spring Boot!";
  }
}
