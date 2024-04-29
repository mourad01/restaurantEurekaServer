package org.restaurant.restauranteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RestaurantEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantEurekaServerApplication.class, args);
	}

}
