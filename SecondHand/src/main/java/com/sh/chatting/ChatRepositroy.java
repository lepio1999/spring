package com.sh.chatting;

import java.util.List;

public interface ChatRepositroy {
	
	public int insert(ChatDTO chatDTO);

	List<Object> selectAllCode(String buy_code);

	String selectChatCode(String chat_code);

	boolean cheackCode(String buy_code,String sell_code);
}
