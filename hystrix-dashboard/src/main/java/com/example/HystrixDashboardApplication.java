package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 *  Server.port = 8040
 *  断路监控地址 http://localhost:8040/hystrix
 *  输入 http://localhost:8020/actuator/hystrix.stream
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboardApplication
{
    public static void main( String[] args ) {
        SpringApplication.run(HystrixDashboardApplication.class,args);
    }
}
