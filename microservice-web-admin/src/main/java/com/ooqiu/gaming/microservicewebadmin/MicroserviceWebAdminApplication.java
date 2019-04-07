package com.ooqiu.gaming.microservicewebadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MicroserviceWebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceWebAdminApplication.class, args);
    }

}
