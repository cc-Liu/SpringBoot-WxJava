package com.ccl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.ccl.*"})
@MapperScan("com.ccl.mapper")
@SpringBootApplication
public class SpringBootWxJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWxJavaApplication.class, args);
    }

}
