package io.discordia.api.gateway.tabzuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class TabZuulGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(TabZuulGatewayApplication.class, args);
  }

}