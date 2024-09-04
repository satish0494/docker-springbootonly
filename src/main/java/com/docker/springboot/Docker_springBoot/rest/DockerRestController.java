package com.docker.springboot.Docker_springBoot.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class DockerRestController {

	@Autowired
	private DockerRepo repo;
	
	@Autowired 
	private BookJPARepo bookRepo;
	
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
	
	@GetMapping("/get/{id}")
	public String getNameById(@PathVariable int id) {
		return repo.getNameById(id);
	}
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks(){
		logger.info("getAllBooks started");
		return bookRepo.findAll();
	}
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		logger.info("addBook started");
		return bookRepo.save(book);
	}
}

