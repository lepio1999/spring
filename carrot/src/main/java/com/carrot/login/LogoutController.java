package com.carrot.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        System.out.println("로그아웃");
        String id = (String) session.getAttribute("Id");
        if (id != null) {
            System.out.println(" Id ");
            session.invalidate();
        }
        return "redirect:/MVC/home";
    }
}