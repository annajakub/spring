package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Shops;

import java.util.List;

public interface ShopsService {

    List<Shops> getAllShops();
    void addShops(Shops shops);
}
