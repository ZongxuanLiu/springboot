package com.ly.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot项目启动入口类
 * 代码需写在Application所在目录的同级或者下级
 */

@SpringBootApplication //springboot核心注解，主要用于开启spring自动配置
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
