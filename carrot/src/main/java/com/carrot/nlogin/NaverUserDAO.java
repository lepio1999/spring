package com.carrot.nlogin;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

public class NaverUserDAO {
    private JdbcTemplate jdbcTemplate;

    public NaverUserDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void saveNaverUser(NaverUserDTO naverUser) {
        try {
            if (naverUser.getNaver_id() != null) {
                String insertQuery = "INSERT INTO naverusertbl (naver_id, nickname, age, gender, email, name) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";

                jdbcTemplate.update(insertQuery, naverUser.getNaver_id(), naverUser.getNickname(),
                    naverUser.getAge(), naverUser.getGender(), naverUser.getEmail(), naverUser.getName());
            } else {
                // 네이버 ID가 없는 경우 처리
                throw new IllegalArgumentException("네이버 ID가 없습니다.");
            }
        } catch (DataAccessException ex) {
            // 데이터베이스 관련 예외 처리
            ex.printStackTrace();
            throw ex; // 예외 다시 던지기
        }
    }
    }
