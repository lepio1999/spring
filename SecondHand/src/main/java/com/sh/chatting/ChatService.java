package com.sh.chatting;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService implements ChatServiceImp {
	
	@Autowired
	ChatRepositroy dao;

	@Override
	public int insertChat(ChatDTO chatDTO) {
		// TODO Auto-generated method stub
		return dao.insert(chatDTO);
	}

	@Override
	public List<Object> selectAllCode(String buy_code) {
		// TODO Auto-generated method stub
		return dao.selectAllCode(buy_code);
	}
	
	@Override
	public String selectChatCode(String chat_code) {
		// TODO Auto-generated method stub
		return dao.selectChatCode(chat_code);
	}

	@Override
	public boolean cheackCode(String buy_code,String sell_code) {
		// TODO Auto-generated method stub
		return dao.cheackCode(buy_code, sell_code);
	}

}
