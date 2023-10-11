package com.acorn.day2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//매핑을 매서드 단위로

// 1.문제
@Controller
public class TestController {

	@Autowired
	TestService service;

	@RequestMapping("/gugudan")
	public String test(int dan, Model model) {
		ArrayList<String> danList = service.getDan(dan);
		model.addAttribute("list", danList);
		System.out.println(dan);
		return "test";
	}

	@RequestMapping("/gugudan1")
	public String test2(@RequestParam(required = false, defaultValue = "2") int dan, Model model) {
		ArrayList<String> danList = service.getDan(dan);
		model.addAttribute("list", danList);
		System.out.println(dan);
		return "test";
	}

	@RequestMapping("/movieList")
	public String testMovie(String movie, Model model) {
		ArrayList<String> movieList = service.getMovieList();
		model.addAttribute("list1", movieList);
		System.out.println(movie);
		return "testMovie";
	}

}
