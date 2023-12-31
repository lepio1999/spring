package com.acorn.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01 {

	@GetMapping("/ex1")
	public String ex1(Model model) {
		model.addAttribute("message1", "화이팅");
		return "ex1";
		
	}
	@ResponseBody
	@GetMapping("/exdata")
	public String ex2() {
		return "화이팅";
	}
	
	@ResponseBody
	@GetMapping("/exBook")
	public ArrayList<Book> ex3(){
		
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book("책1",12000));
		list.add(new Book("책2",24000));
		list.add(new Book("책3",32000));
		return list;
	}
	
	
	
	
	
}
