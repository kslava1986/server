package com.example.demo.controllers;


import com.example.demo.model.Product;
import com.example.demo.model.Shop;
import com.example.demo.service.ProductService;
import com.example.demo.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@org.springframework.web.bind.annotation.RestController
@RequestMapping (value = "/shops")
public class RestController {
    private ShopService shopService;
    private ProductService productService;

    @Autowired
    public void setShopService(ShopService shopService) {
        this.shopService = shopService;
    }
    @Autowired
    public void setProductService(ProductService productService) { this.productService = productService;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Collection<Shop> all(){
        System.out.println("**********Start************");
        Collection<Shop> shops = shopService.getAll();
        for (Shop s : shops) {
            System.out.println(s.toString());
        }
        System.out.println("**********Stop************");
        return shops;
    }
    ///////////////////////////////////////////////////////////
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Collection<Product> getProductsByShop(@PathVariable int id){
     return productService.getAllByShop(id);
    }


}
