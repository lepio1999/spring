package com.carrot.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
        return "loginResult";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLogin(@RequestParam("Id") String inputId,
                              @RequestParam("Pw") String inputPw,
                              @RequestParam("option") String option,
                              Model model) {
        // LoginService s = new LoginService();
        // Your login service logic here

        System.out.println("로그인 옵션 " + option);

        if (option == null || option.isEmpty()) {
            model.addAttribute("message", "회원옵션을 선택하세요.");
            return "loginResult";
        }

        boolean loginResult = false;

        if (option.equals("buyer")) {
            // loginResult = s.loginUser(inputId, inputPw);
            // Implement your buyer login logic here
        } else {
            // loginResult = s.loginUser2(inputId, inputPw);
            // Implement your seller login logic here
        }

        if (loginResult) {
            // Handle successful login
            // HttpSession session = req.getSession();
            // session.setAttribute("Id", inputId);

            if (option.equals("buyer")) {
                // Redirect to the buyer-specific page
                return "redirect:/MVC/home";
            } else if (option.equals("seller")) {
                // Redirect to the seller-specific page
                return "redirect:/MVC/seller.do";
            }
        } else {
            // Handle login failure
            model.addAttribute("message", "로그인 실패. 아이디 또는 비밀번호를 확인하세요.");
            return "loginResult";
        }
		return option;
    }
}