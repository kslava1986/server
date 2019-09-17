package com.example.demo.controllers;


import com.example.demo.Shop;
import com.example.demo.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping (value = "/all")
public class RestController {
    private ShopService service;

    @Autowired
    public void setService(ShopService service) {
        this.service = service;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Collection<Shop> all(){
        System.out.println("**********Start************");
        Collection<Shop> shops = service.getAll();
        for (Shop s : shops) {
            System.out.println(s.toString());
        }
        System.out.println("**********Stop************");
        return shops;
    }


}
