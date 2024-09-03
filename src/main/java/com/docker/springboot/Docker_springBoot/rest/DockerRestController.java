package com.docker.springboot.Docker_springBoot.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class DockerRestController {

	
	private Logger logger = LoggerFactory.getLogger(DockerRestController.class);

	public DockerRestController() {
		logger.info("***** WelcomeRestController :: Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "Welcome to Satish Docker Message (HYD) ..!!";
		logger.info("***** welcomeMsg() execution end *****");
		logger.info("******************************************************************");
		return msg;
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		logger.info("***** greetMsg() execution start *****");
		String msg = "Good Morning, Welcome to Satish";
		System.out.println("testing git collaboration");
		logger.info("***** greetMsg() execution end *****");
		logger.info("***** greetMsg() execution successfull *****");
		logger.info("***** ***************************** *****");
		return msg;
	}
}
