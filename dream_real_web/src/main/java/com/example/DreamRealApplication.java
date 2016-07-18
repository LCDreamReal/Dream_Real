package com.example;

import com.dream.real.dubbo.provider.intf.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@ImportResource("classpath*:dubbo-provider.xml")
public class DreamRealApplication {

    @Resource
    private DemoService demoService;

	@RequestMapping("/")
	public String index(){

//        System.out.println(demoService.sayHello("hello"));
        return "Spring Boot Test!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DreamRealApplication.class, args);
    }
}
