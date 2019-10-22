package com.example.demo.service;

import com.example.demo.RestRepository;
import com.example.demo.model.Shop;
import com.example.demo.data.ShopSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ShopService {
    private RestRepository repository;
    private ShopSource localRepository;

    @Autowired
    public void setLocalRepository(ShopSource localRepository) {
        this.localRepository = localRepository;
    }

    @Autowired
    public void setRepository(RestRepository repository) {
        this.repository = repository;
    }

    public Collection<Shop> getAll(){
       // return (List<Shop>) repository.findAll();
        return localRepository.findAll();
    }
}
