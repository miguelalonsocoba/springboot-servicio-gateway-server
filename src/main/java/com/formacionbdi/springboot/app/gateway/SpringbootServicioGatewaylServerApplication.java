package com.formacionbdi.springboot.app.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient // Activación de configuración Eureka
@SpringBootApplication
public class SpringbootServicioGatewaylServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioGatewaylServerApplication.class, args);
	}

}
