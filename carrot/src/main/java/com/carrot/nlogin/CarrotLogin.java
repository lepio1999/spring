package com.carrot.nlogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarrotLogin {

    @GetMapping("/carrotLogin")
    public String showLoginPage() {
        return "carrotLogin";
    }
}
