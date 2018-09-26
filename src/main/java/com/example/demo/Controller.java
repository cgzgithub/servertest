package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@EnableAutoConfiguration
@SpringBootApplication

public class Controller {
	
	@RequestMapping("/hello")
	String home() {
        return "Hello Worldww";
    }
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public User getUser() {
		User u = new User();
		u.setName("mynames");
		u.setAge(33);
		u.setCreateTime(new Date());
		return u;
	}

}
