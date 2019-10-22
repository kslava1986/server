package com.example.demo.service;

import com.example.demo.data.Storage;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductService {
    private Storage storage;

    @Autowired
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Collection<Product> getAllByShop(long shopId)
    {return storage.findByShopId(shopId);}

}
