package com.tis.mx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * The Class ApplicationStarter.
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationStarter {

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(ApplicationStarter.class, args);
  }

}