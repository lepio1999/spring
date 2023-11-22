package com.sh.chatting;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ChatRepositroyImp implements ChatRepositroy {
	
	@Autowired
	private SqlSession session;
	private static String namespace = "com.acorn.webchat.ChatMapper.";

	@Override
	public int insert(ChatDTO chatDTO) {
		return session.insert(namespace + "insertChat", chatDTO);

	}
	
	@Override
	public List<Object> selectAllCode(String buy_code){
		List<Object> code = session.selectList(namespace + "selectChatSellCode", buy_code);
		return code;
	}
	
	@Override
	public String selectChatCode(String chat_code){
		String code = session.selectOne(namespace + "selectChatChatCode", chat_code);
		return code;
	}

	@Override
	public boolean cheackCode(String buy_code, String sell_code) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("buy_code", buy_code);
		map.put("sell_code", sell_code);
		
		System.out.println(buy_code);
		System.out.println(sell_code);

		return session.selectOne(namespace+"cheackCode",map);
	}
	
	

}
