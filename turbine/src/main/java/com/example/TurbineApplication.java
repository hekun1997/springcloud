package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Hello world!
 * 8041 断路器聚合监控
 */
@EnableTurbine
@SpringBootApplication
public class TurbineApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
