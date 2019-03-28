package com.vargur.fwwbase;

import com.vargur.fwwbase.config.MainConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FwwBaseApplication implements CommandLineRunner {
  private static Logger log = LogManager.getLogger(FwwBaseApplication.class);

  @Autowired
  private MainConfig myConfig;

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(FwwBaseApplication.class);
    app.run();
  }

  public void run(String... args) {
    log.info("using environment: " + myConfig.getEnvironment());
    log.info("name: " + myConfig.getName());
  }
}
