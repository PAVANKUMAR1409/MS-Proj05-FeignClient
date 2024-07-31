package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsProj05FeignClientEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj05FeignClientEurekaServerApplication.class, args);
	}

}
