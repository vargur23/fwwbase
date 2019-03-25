package com.vargur.fwwbase;

import com.vargur.fwwbase.config.MainConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FwwBaseApplication implements CommandLineRunner{

  @Autowired
  private MainConfig myConfig;

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(FwwBaseApplication.class);
    app.run();
	}

  public void run(String... args) throws Exception {
    System.out.println("using environment: " + myConfig.getEnvironment());
    System.out.println("name: " + myConfig.getName());
}
}
