package com.senink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroCloudPowerStationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCloudPowerStationApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello ,xs !";
	}
}
