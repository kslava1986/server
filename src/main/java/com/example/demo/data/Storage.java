package com.example.demo.data;

import com.example.demo.model.Product;
import com.example.demo.model.Shop;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class Storage {
    private Map<Long, List<Product>> products;
    private Map<Long, Shop> shops;

    Storage()
    {
        this.products = new HashMap<>();
        this.shops = new HashMap<>();
        init();
    }
    private void init()
    {
        createShops();
        createProducts();

    }
    private void createShops()
    {
        Shop s1 = new Shop();
        s1.setId(1);
        s1.setName("Київська,88");
        s1.setTel("0988467236");
        shops.put(s1.getId(), s1);

        Shop s2 = new Shop();
        s2.setId(2);
        s2.setName("Бульвар Польський 13а");
        s2.setTel("0983995114");
        shops.put(s2.getId(), s2);

        Shop s3 = new Shop();
        s3.setId(3);
        s3.setName("Хлібна,39/19");
        s3.setTel("0971146295");
        shops.put(s3.getId(), s3);

        Shop s4 = new Shop();
        s4.setId(4);
        s4.setName("М-н Станишівський,3/2");
        s4.setTel("0986408197");
        shops.put(s4.getId(), s4);

        Shop s5 = new Shop();
        s5.setId(5);
        s5.setName("пр-т Миру,61/2");
        s5.setTel("0971084756");
        shops.put(s5.getId(), s5);

        Shop s6 = new Shop();
        s6.setId(6);
        s6.setName("Вільський Шлях,14");
        s6.setTel("0985751069");
        shops.put(s6.getId(), s6);

        Shop s7 = new Shop();
        s7.setId(7);
        s7.setName("Івана Мазепи,5");
        s7.setTel("0985660818");
        shops.put(s7.getId(), s7);
    }

    private void createProducts()
    {
        List<Product> list1 = new ArrayList<>();
        Product prod11 = new Product(11,
                "prod11",
                "descr11",
                12.53f);
        list1.add(prod11);

        Product prod12 = new Product(12,
            "prod12",
            "descr12",
            22.53f);
        list1.add(prod12);

        List<Product> list2 = new ArrayList<>();
        Product prod21 = new Product(21,
                "prod21",
                "descr21",
                12.53f);
        list2.add(prod21);

        Product prod22 = new Product(22,
                "prod22",
                "descr22",
                22.53f);
        list2.add(prod22);

        Product prod23 = new Product(23,
                "prod23",
                "descr23",
                22.53f);
        list2.add(prod23);




        products.put(1l, list1);
        products.put(2l, list2);

    }



}
