package com.springcloud.demo.km.currencyconversionservicekm;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientName;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange-service-km",url = "localhost:8000")
@FeignClient(name = "currency-exchange-service-km")
//@FeignClient(name = "netflix-zuul-api-gateway-server" )
@RibbonClient(name= "currency-exchange-service-km")
public interface CurrencyExchangeServiceProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
//    @GetMapping("/currency-exchange-service-km/currency-exchange/from/{from}/to/{to}")
    CurrencyConversion retrieveExchangeValue(@PathVariable("from") String from,
                                             @PathVariable("to") String to);
}