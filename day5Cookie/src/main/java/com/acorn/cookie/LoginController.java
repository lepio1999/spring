package com.acorn.cookie;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping("/login")
	public String loginForm() {
		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginForm(String id, String pwd, boolean rememberId, HttpServletRequest request,
			HttpServletResponse response) {
		// 로그인 성공시
		if (logincheck(id, pwd)) {
			
			//세션에 저장
			HttpSession session = request.getSession();
			session.setAttribute("sessionId", id);

			// 아이디 기억
			if (rememberId) {
				// 저장
				Cookie cookie = new Cookie("id", id);
				response.addCookie(cookie);
			} else {
				// 삭제
				Cookie cookie = new Cookie("id", id);
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}

			return "main";
		} else {
			// 로그인 실패시
			//String msg = "id pwd 불일치";
			String msg = URLEncoder.encode("★id pwd 불일치★");
			return "redirect:/login/login?msg="+msg; // response.sendRedirect("/login/");
		}

	}
	@RequestMapping("/logOut")
	public String logOut(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";
	}

	private boolean logincheck(String id, String pwd) {
		if(id.equals("acorn")&& pwd.equals("1234")) {
		return true;
		}else {
			return false;
		}
	}

}