package com.footohigh;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.footohigh.mapper")
public class AppMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AppMain.class, args);
        System.out.println("sadasdas");
    }
}
