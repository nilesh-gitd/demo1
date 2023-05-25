package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

//		UserRepository userRepository = context.getBean(UserRepository.class);
//
//		User user = new User();
//		user.setUserID(1);
//		user.setName("nilesh");
//		user.setAddress("nashik");
//		user.setDOB("2.2.20");
//
//		User ru = userRepository.save(user);
	}

}
