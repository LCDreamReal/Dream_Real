package com.dream.real.service.impl;

import com.dream.real.repository.CityRepository;
import com.dream.real.entity.City;
import com.dream.real.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc:     City的Service实现
 * Author:   licheng
 * DateTime: 2016-07-19 14:13
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> findByName(String name) {
        return cityRepository.findByName(name);
    }

    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findOne(Long id) {
        return cityRepository.findOne(id);
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

}
