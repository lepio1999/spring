package com.acorn.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao;
	
	@RequestMapping("/inseret")
	public void insert() {
		dao.insert(new Member("test15","11","test","test"));
	}
	
	@RequestMapping("/select")
	public void select() {
		dao.select();
	}

}