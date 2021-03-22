package com.terryxi.datacenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.terryxi.datacenter.mapper")
public class DatacenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatacenterApplication.class, args);
    }

}
