package com.dream.real;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@ImportResource({"classpath:dubbo-provider.xml", "dubbo-consumer.xml"})
public class DreamRealApplication {

	public static void main(String[] args) {
		SpringApplication.run(DreamRealApplication.class, args);
    }
}
