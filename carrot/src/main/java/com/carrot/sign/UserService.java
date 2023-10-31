package com.carrot.sign;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
 
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    // 사용자 목록 가져오기
    public List<User> getAllUsers() {
        try {
            ArrayList<User> userList = userDao.selectAll();
            return userList;
        } catch (SQLException e) {
            e.printStackTrace();
            // 오류 처리 또는 예외 처리
            throw new RuntimeException("사용자 목록을 가져오는 중 오류가 발생했습니다.", e);
        }
    }
}