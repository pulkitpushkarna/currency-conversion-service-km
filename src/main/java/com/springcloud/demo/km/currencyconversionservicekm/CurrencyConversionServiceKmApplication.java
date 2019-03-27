package com.springcloud.demo.km.currencyconversionservicekm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.springcloud.demo.km.currencyconversionservicekm")
@EnableDiscoveryClient
public class CurrencyConversionServiceKmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceKmApplication.class, args);
	}
}
