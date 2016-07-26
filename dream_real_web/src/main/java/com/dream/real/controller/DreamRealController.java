package com.dream.real.controller;

import com.alibaba.fastjson.JSON;
import com.dream.real.dubbo.provider.intf.DemoService;
import com.dream.real.entity.City;
import com.dream.real.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Desc:
 * Author:   licheng
 * Datetime: 2016-07-26 16:18
 */
@RestController
public class DreamRealController {

    @Resource
    private DemoService demoService;

    @Resource
    private CityService cityService;

    @RequestMapping("/test")
    public Map<String, Object> index(){

        Map<String, Object> map = new HashMap<String, Object>();

        Iterable<City> cityIterable = cityService.findAll();
        System.out.println(JSON.toJSONString(cityIterable));

        City city = cityService.findOne(1L);
        System.out.println(JSON.toJSONString(city));

        List<City> cityList = cityService.findByName("11");
        System.out.println(JSON.toJSONString(cityList));

        map.put("cityIterable", cityIterable);
        map.put("city", city);
        map.put("cityList", cityList);

        /*City citySave = cityService.save(new City("合肥", "安徽"));
        System.out.println(JSON.toJSONString(citySave));*/
        return map;
    }
}
