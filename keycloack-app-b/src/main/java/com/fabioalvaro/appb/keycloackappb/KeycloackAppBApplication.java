package com.fabioalvaro.appb.keycloackappb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KeycloackAppBApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeycloackAppBApplication.class, args);
    }

}
