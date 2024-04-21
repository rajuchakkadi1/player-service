package com.rockScissorPaper.rspPlayer.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://localhost:8081", value = "rspSystem")
public interface SystemClient {

	@GetMapping("/systemGamePlay")
	public String getSystemSign();
}
