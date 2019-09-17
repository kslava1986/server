package com.example.demo.service;

import com.example.demo.RestRepository;
import com.example.demo.Shop;
import com.example.demo.data.ShopSource;
import javafx.print.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
