package com.ooqiu.gaming.microserviceserviceadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ooqiu.gaming.microservicedemodomain.mapper")
public class MicroserviceServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceServiceAdminApplication.class, args);
    }

}
