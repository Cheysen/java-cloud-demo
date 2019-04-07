package com.ooqiu.gaming.microserviceserviceadmin;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.container.Main;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan(basePackages = "com.ooqiu.gaming.microserviceserviceadmin.mapper")
public class MicroserviceServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceServiceAdminApplication.class, args);
        Main.main(args);
    }

}
