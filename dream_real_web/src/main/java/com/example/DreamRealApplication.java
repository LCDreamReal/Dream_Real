package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@ImportResource("classpath*:dubbo-provider.xml")
public class DreamRealApplication {

	@RequestMapping("/")
	public String index(){

		return "Spring Boot Test!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DreamRealApplication.class, args);
	}
}
