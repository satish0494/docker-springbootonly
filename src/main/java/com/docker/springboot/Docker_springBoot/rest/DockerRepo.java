package com.docker.springboot.Docker_springBoot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DockerRepo {

	@Autowired
	private JdbcTemplate jdbc;
	
	
	public String getNameById(int id) {
		String sql = "select name from employee where id = ?";
		String name = jdbc.queryForObject(sql,String.class, id);
		
		return name;
	}
}
