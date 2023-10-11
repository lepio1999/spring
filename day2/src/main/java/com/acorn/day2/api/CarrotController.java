package com.acorn.day2.api;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarrotController {

	@Autowired
	CarrotDAO dao;

	@RequestMapping("/select")
	public String SearchAll(Model model) throws SQLException {
		ArrayList<CarrotDTO> carrotList = dao.selectAll();
		model.addAttribute("carrotList", carrotList);
		return "carrot";
	}
	
	@RequestMapping("/update")
	public String updateCarrot(HttpServletRequest request) {
	    String id = request.getParameter("id");
	    String priceParam = request.getParameter("price");
	    int newPrice = Integer.parseInt(priceParam);
	    String newInfo = request.getParameter("info");

	    try {
	        dao.updateCarrot(id, newPrice, newInfo);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return "update"; 
	}
}
