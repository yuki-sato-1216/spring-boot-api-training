package com.example.springboot.api_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiDemoApplication {

	@RequestMapping("/api")
    public String home() {
        return "本サービスはAPIを提供しますOpenAPI仕様書をご確認の上、適切なAPIパスをご利用ください。";
    }

	public static void main(String[] args) {
		SpringApplication.run(ApiDemoApplication.class, args);
	}

}
