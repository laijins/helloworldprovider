package com.service.helloworld;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableServiceComb
public class HelloworldproviderApplication {
    public static void main(String[] args) {
         SpringApplication.run(HelloworldproviderApplication.class,args);
    }
}
