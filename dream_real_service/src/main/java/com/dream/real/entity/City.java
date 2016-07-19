package com.dream.real.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Desc:     城市实体Bean
 * Author:   licheng
 * DateTime: 2016-07-19 14:09
 */
@Entity
public class City implements Serializable{

    private static final long serialVersionUID = 1222154987138981960L;

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String state;

    public City(){}

    public City(String name, String state){

        this.name = name;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
