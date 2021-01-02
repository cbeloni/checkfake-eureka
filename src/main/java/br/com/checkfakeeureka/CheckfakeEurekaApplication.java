package br.com.checkfakeeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class CheckfakeEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckfakeEurekaApplication.class, args);
	}

}
