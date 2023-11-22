package com.sh.chatting;

import java.util.List;

public interface ChatServiceImp {

	public int insertChat(ChatDTO chatDTO);
	
	List<Object> selectAllCode(String buy_code);

	String selectChatCode(String chat_code);
	
	boolean cheackCode(String buy_code,String sell_code);
	
	

}
