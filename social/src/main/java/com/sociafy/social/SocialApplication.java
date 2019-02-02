package com.sociafy.social;

import com.sociafy.social.domain.Admin;
import com.sociafy.social.domain.Person;
import com.sociafy.social.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SocialApplication {

	public static void main(String[] args) {
        SpringApplication.run(SocialApplication.class, args);

	}

}

