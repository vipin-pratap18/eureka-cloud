package com.demo.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * This is eureka server starting point which configures eureka server where all services needs to register with
 * eureka, in order to be discovered.
 * @VipinK 
 */

@EnableEurekaServer
@SpringBootApplication
@EnableAutoConfiguration
public class ServiceDiscoveryApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ServiceDiscoveryApp.class, args);
    }
}
