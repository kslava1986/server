package com.example.demo.data;

import com.example.demo.model.Shop;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ShopSource {
    private Map<Long, Shop> localBase;

    public ShopSource() {
        init();
    }

    private void init(){
        localBase = new HashMap<>();

        Shop s1 = new Shop();
        s1.setId(1);
        s1.setName("Київська,88");
        s1.setTel("0988467236");
        localBase.put(s1.getId(), s1);

        Shop s2 = new Shop();
        s2.setId(2);
        s2.setName("Бульвар Польський 13а");
        s2.setTel("0983995114");
        localBase.put(s2.getId(), s2);

        Shop s3 = new Shop();
        s3.setId(3);
        s3.setName("Хлібна,39/19");
        s3.setTel("0971146295");
        localBase.put(s3.getId(), s3);

        Shop s4 = new Shop();
        s4.setId(4);
        s4.setName("М-н Станишівський,3/2");
        s4.setTel("0986408197");
        localBase.put(s4.getId(), s4);

        Shop s5 = new Shop();
        s5.setId(5);
        s5.setName("пр-т Миру,61/2");
        s5.setTel("0971084756");
        localBase.put(s5.getId(), s5);

        Shop s6 = new Shop();
        s6.setId(6);
        s6.setName("Вільський Шлях,14");
        s6.setTel("0985751069");
        localBase.put(s6.getId(), s6);

        Shop s7 = new Shop();
        s7.setId(7);
        s7.setName("Івана Мазепи,5");
        s7.setTel("0985660818");
        localBase.put(s7.getId(), s7);


    }

    public Collection<Shop> findAll()
    {
        return localBase.values();
    }



}
