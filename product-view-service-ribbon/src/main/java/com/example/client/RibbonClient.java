package com.example.client;

import com.example.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RibbonClient {

    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProducts(){
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/listProducts",List.class);
    }
}
