package com.dream.real.repository;

import com.dream.real.entity.City;
import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Desc:     City的Repository
 * Author:   licheng
 * DateTime: 2016-07-19 14:33
 * @RepositoryRestResource http://localhost:8080/city直接访问
 */
@RepositoryRestResource(path = "city")
public interface CityRepository extends Repository<City, Long> {

    List<City> findByName(String name);

    Iterable<City> findAll();

    City save(City city);

    City findOne(Long id);
}
