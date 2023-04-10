package com.docker.jenikin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenikinsDockerIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenikinsDockerIntegrationApplication.class, args);
		System.out.println("sysot commited hello");
	}

}
