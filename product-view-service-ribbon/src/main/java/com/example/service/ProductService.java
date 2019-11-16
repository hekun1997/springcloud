package com.example.service;

import com.example.client.RibbonClient;
import com.example.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    RibbonClient ribbonClient;

    public List<Product> listProducts(){
        return ribbonClient.listProducts();
    }
}
