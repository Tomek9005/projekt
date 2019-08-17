package com.sda.javagda21.projekt.controller;

import com.sda.javagda21.projekt.model.CurrencyModel;
import com.vaadin.flow.component.dependency.CssImport;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class CurrencyClient {

    @EventListener(ApplicationContextEvent.class)
    public void  getCurrencyRates(){
        RestTemplate restTemplate = new RestTemplate();
        CurrencyModel forObject = restTemplate.getForObject("https://api.exchangeratesapi.io/latest?base=PLN", CurrencyModel.class);
        System.out.println(forObject);
    }
}
