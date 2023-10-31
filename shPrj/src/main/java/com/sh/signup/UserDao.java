package com.sh.signup;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

public class UserDao {
	private JdbcTemplate jdbcTemplate;

	public UserDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveUser(User user) {
		String sql = "INSERT INTO user_tbl (userCode, userId, userPw, address, phoneNum, memberPost, memberAddr,detailedAddress,userBirth,userNickname,userImage,userHeat) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, user.getUserCode(), user.getUserId(), user.getUserPw(), user.getAddress(),
				user.getPhoneNum(), user.getMemberPost(), user.getMemberAddr(), user.getDetailedAddress(),
				user.getUserBirth(), user.getUserNickname(), user.getUserImage(), user.getUserHeat());
	}
}
