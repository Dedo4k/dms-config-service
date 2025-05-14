package dev.vlxd.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DmsConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmsConfigServiceApplication.class, args);
    }

}
