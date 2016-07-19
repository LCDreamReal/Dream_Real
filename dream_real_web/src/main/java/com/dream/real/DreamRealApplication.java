package com.dream.real;

import com.alibaba.fastjson.JSON;
import com.dream.real.dubbo.provider.intf.DemoService;
import com.dream.real.entity.City;
import com.dream.real.service.CityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@ImportResource("classpath:dubbo-provider.xml")
public class DreamRealApplication {

    @Resource
    private DemoService demoService;

    @Resource
    private CityService cityService;

	@RequestMapping("/")
	public String index(){
        Iterable<City> cityIterable = cityService.findAll();
        System.out.println(JSON.toJSONString(cityIterable));

        City city = cityService.findOne(1L);
        System.out.println(JSON.toJSONString(city));

        List<City> cityList = cityService.findByName("11");
        System.out.println(JSON.toJSONString(cityList));

        City citySave = cityService.save(new City("合肥", "安徽"));
        System.out.println(JSON.toJSONString(citySave));
        return demoService.sayHello("licheng");
	}

	public static void main(String[] args) {
		SpringApplication.run(DreamRealApplication.class, args);
    }
}
