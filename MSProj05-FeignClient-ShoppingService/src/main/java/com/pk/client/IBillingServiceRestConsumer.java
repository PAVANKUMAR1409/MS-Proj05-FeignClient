package com.pk.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("BillingService")
public interface IBillingServiceRestConsumer {

	@GetMapping("/billing/api/info")
	public String fetchBillDetails(); 
}
