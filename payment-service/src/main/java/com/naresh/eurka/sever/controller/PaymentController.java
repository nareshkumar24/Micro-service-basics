package com.naresh.eurka.sever.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/payment-provider")
public class PaymentController {
	
	@GetMapping("/payNow/{price}")
	public String payNow(@PathVariable int price) {
		return "payment with "+price + " @@@@@@" + "is sucessfull";
		
	}

}
