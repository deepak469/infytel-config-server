package com.infosys.infytel.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
//@EnableEurekaClient
@EnableDiscoveryClient
public class InfytelConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfytelConfigServerApplication.class, args);
	}

}

