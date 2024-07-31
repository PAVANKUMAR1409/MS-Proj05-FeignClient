package com.pk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing/api")
public class BillingServiceController {
	
	@Value("${server.port}")
	private Integer port;
	
	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	@GetMapping("/info")
	public String getBillinInfo() {
		return "We accept card payment, upi payment, net banking, COD :: "+port+"=====>Instance Id :: "+instanceId;
	}

}
