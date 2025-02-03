package com.example.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JDBC.DAO.UserDAO;
import com.example.JDBC.Entity.USER;

@SpringBootApplication
public class JdbcSpringApplication implements CommandLineRunner {

	@Autowired
	private UserDAO userdao;
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		USER user1 = new USER("Pravin","Pravin@gmail.com","male","sadegaon");
		boolean Status = userdao.insertUser(user1);
		if(Status) {
			System.out.println("Created Succesfully");
			
		}
		
		else {
			System.out.println("Error");
		}
	}
	
	

}
