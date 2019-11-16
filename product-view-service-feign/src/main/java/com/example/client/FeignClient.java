package com.example.client;

import com.example.vo.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(value = "PRODUCT-DATA-SERVICE",fallback = FeignClientHystrix.class)
public interface FeignClient {

    @GetMapping("/listProducts")
    public List<Product> listProducts();
}
