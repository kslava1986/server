package com.example.demo.service;

import com.example.demo.data.Storage;
import com.example.demo.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ShopService {
    private Storage storage;

    @Autowired
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Collection<Shop> getAll(){
       // return (List<Shop>) repository.findAllShops();
        return storage.findAllShops();
    }
}
