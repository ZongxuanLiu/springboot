package com.ly.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //开启spring配置，使其他注解生效
//也可以不分别在mapper文件里加@Mpper注解，在application里以下注解
@MapperScan(basePackages = "com.ly.springboot.mapper") //开启扫描mapper接口的包以及子目录
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
