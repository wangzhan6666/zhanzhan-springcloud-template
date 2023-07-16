package com.wangzhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  // 启动nacos客户端
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})   // 添加(exclude = {DataSourceAutoConfiguration.class})，解决在配置Druid多数据源时，出现循环依赖的问题
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
