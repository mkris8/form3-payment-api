package com.form3.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PaymentBootMain {
	
	public static void main(String[] args) {
		SpringApplication.run(PaymentBootMain.class, args);
	}
	
}