package com.dream.real.service;

import com.dream.real.entity.City;

/**
 * Desc:     City的Service
 * Author:   licheng
 * DateTime: 2016-07-19 14:14
 */
public interface CityService {

    java.util.List<City> findByName(String name);

    public Iterable<City> findAll();

    City findOne(Long id);

    City save(City city);
}
