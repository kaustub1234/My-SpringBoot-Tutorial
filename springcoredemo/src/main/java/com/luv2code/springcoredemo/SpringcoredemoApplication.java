package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(
//scans all the packages and its sub packages mentioned here
// scanBasePackages = {
// "com.luv2code.springcoredemo", "com.luv2code.util"
// }
// )

public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
