package com.acorn.day1.param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingEx2 {
  
    
    @RequestMapping("/user")     
    public void test1(@ModelAttribute User user){ //기본생성자, setter사용
    	System.out.println(user);
        System.out.println(user.getId());
        System.out.println(user.getPw());
    }
}
