package com.dream.real;

import com.dream.real.entity.City;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Desc:     City的Repository
 * Author:   licheng
 * DateTime: 2016-07-19 14:33
 */
@org.springframework.stereotype.Repository
public interface CityRepository extends Repository<City, Long> {

    List<City> findByName(String name);

    Iterable<City> findAll();

    City save(City city);

    City findOne(Long id);
}
