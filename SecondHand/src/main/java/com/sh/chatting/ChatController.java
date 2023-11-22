package com.sh.chatting;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChatController {
	
	@Autowired
	ChatServiceImp chatService;
	
//	@GetMapping("/chatinsert")
//	public String chatinsert() {
//		return "/homePage/homePage"; 
//	}
	
	
	
//	@PostMapping("/insertchatcode")
//	public String chatcode(ChatDTO chatDTO, HttpSession session) {
//	    session.setAttribute("buy_code", chatDTO.getBuy_code());
//	    chatService.insertChat(chatDTO);
//	    System.out.println("성공");
//	    return "/homePage/homePage";
//	}
	
//	@GetMapping("/chattingList")
//	public String chattingList() {
//		return "chattingList"; 
//	}
	
	@PostMapping("/chattingList")
	public String chatList(@RequestParam String buy_code, Model model) {
	    List<Object> chatList = chatService.selectAllCode(buy_code);
	    model.addAttribute("chatList", chatList);
	    System.out.println(chatList);
	    return "chattingList";
	}
	
	@PostMapping("/inchat")
	public String inchat(@RequestParam String chat_code, Model model) {
        String chatCode = chatService.selectChatCode(chat_code);
        model.addAttribute("chatCode", chatCode);
	    System.out.println(chatCode);
	    return "chatting";
	}
	
	@PostMapping("/checkCode")
	public String checkCode(ChatDTO chatDTO,@RequestParam String buy_code, @RequestParam String sell_code,HttpSession session, Model model) {
	    boolean isCodeValid = chatService.cheackCode(buy_code, sell_code);
	    model.addAttribute("isCodeValid", isCodeValid);
	    System.out.println(isCodeValid);
	    if(isCodeValid == false) {
		    session.setAttribute("buy_code", chatDTO.getBuy_code());
		    chatService.insertChat(chatDTO);
		    System.out.println("성공");
		    return "/homePage/homePage";
	    }else
	    	System.out.println("실패");
	    	return "/products/productDetail";
	
	}
	


}
