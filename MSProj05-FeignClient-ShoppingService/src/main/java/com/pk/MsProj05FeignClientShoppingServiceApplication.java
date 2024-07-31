package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MsProj05FeignClientShoppingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj05FeignClientShoppingServiceApplication.class, args);
	}

}
