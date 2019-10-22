package com.example.demo.controllers;


import com.example.demo.model.Shop;
import com.example.demo.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;

@org.springframework.web.bind.annotation.RestController
@RequestMapping (value = "/shops")
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
    ///////////////////////////////////////////////////////////
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getProductsByShop(@PathVariable int id){
        if (id==1)
        {
            return "id=1";
        }

     return "Product test";
    }

}
