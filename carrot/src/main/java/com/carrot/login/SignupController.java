package com.carrot.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupController {

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String showSignupPage() {
        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String handleSignup(@RequestParam("buyerId") String buyerId,
                               @RequestParam("buyerPw") String buyerPw,
                               @RequestParam("buyerName") String buyerName,
                               @RequestParam("buyerAddress") String buyerAddress,
                               Model model) {
        // LoginDAO dao = new LoginDAO();
        // Your signup logic here

        if (buyerId.isEmpty() || buyerPw.isEmpty() || buyerName.isEmpty() || buyerAddress.isEmpty()) {
            model.addAttribute("message", "모든 정보를 입력해주세요.");
            return "signup";
        }

        // Check for duplicate IDs and perform signup logic
        // boolean id = dao.idCheck(buyerId);
        // Implement your duplicate ID check logic here

        // if (!id) {
        //     model.addAttribute("message", "이미 사용 중인 아이디입니다.");
        //     return "signup";
        // } else {
        //     boolean signupResult = dao.signupUser(buyerId, buyerPw, buyerName, buyerAddress);
        //     Implement your signup logic here
        //     if (signupResult) {
        //         model.addAttribute("message", "회원가입이 완료되었습니다.");
        //         return "loginResult";
        //     } else {
        //         model.addAttribute("message", "회원가입에 실패하였습니다.");
        //         return "loginResult";
        //     }
        // }
        return "redirect:/MVC/home"; // Redirect to the home page after successful signup
    }
}