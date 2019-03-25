package com.vargur.fwwbase.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class MainConfig{

  private String name;
  private String environment;

  public void setName(String name ){
    this.name = name;
  }

  public void setEnvironment(String environment ){
    this.environment = environment;
  }

  public String getName(){
    return name;
  }

  public String getEnvironment(){
    return environment;
  }


}
