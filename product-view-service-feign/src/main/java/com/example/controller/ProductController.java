package com.example.controller;

import com.example.service.ProductService;
import com.example.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @Value("${version}")
    String version;

    @RequestMapping("/listProducts")
    public Object products(Model m){
        List<Product> ps = new ArrayList<>();
        ps = productService.listProducts();
        m.addAttribute("version",version);
        m.addAttribute("ps",ps);
        return "products";
    }
}
