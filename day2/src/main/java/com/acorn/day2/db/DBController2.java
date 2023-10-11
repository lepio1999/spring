package com.acorn.day2.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DBController2 {
	
	@Autowired
	TestDAO2 dao;
	
	@RequestMapping("/dbTest2")
	public String test2 () {
		dao.select2();
		return"db2";
		
	}

}
