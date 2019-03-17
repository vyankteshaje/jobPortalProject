package com.app.jp.extremity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages="com")
public class JobportalCompanylistApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobportalCompanylistApplication.class, args);
	}

}
