package com.example.service;

import com.example.client.FeignClient;
import com.example.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    FeignClient feignClient;

    public List<Product> listProducts(){
        return feignClient.listProducts();
    }
}
