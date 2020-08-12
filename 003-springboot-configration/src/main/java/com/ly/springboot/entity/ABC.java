package com.ly.springboot.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * 使用@ConfigurationProperties注解出现警告问题，
 * 在pom文件中添加spring-boot-configuration-processor的依赖
 *
 */
@Component // 将此类交给spring容器进行管理
@ConfigurationProperties(prefix = "abc") // prefix是配置文件中的前缀
@Data
public class ABC {
    private String name;
    private String websit;
}
