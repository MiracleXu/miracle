package com.miracle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.miracle.mapper")
public class MiracleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiracleApplication.class, args);
    }
}
