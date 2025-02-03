package com.example.JDBC.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.JDBC.Entity.USER;

@Repository
public class UserDAO {
 
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public boolean insertUser (USER user) {
		boolean status = false;
		
		try {
			String INSERT_SQL_QUERY = "INSERT INTO USER (name , email, gender, city) VALUES (?,?,?,?)";
			int count = jdbctemplate.update(INSERT_SQL_QUERY,user.getName(),user.getEmail(),user.getGender(),user.getCity());
			if(count > 0 ) {
				return true;
			}
			else {
				return false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
