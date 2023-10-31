package com.carrot.sign;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;



@Repository
public class UserDao {

    @Autowired
	DataSource ds;

    public ArrayList<User> selectAll() throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		String sql = "select * from user_tbl1";

		ArrayList<User> userList = new ArrayList<>();
		try {
			con = ds.getConnection();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			  while (rs.next()) {
		            String user_code = rs.getString("user_code");
		            String user_id = rs.getString("user_id");
		            String user_pw = rs.getString("user_pw");

		            User user = new User();
		            user.setUser_code(user_code);
		            user.setUser_id(user_id);
		            user.setUser_pw(user_pw);

		            userList.add(user);
		        }
		} catch (SQLException e) {
			e.printStackTrace();
		}

		rs.close();
		pst.close();
		con.close();
		return userList;

	}
}
