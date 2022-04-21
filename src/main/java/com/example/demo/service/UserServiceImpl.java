package com.example.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.model.Usertable;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.UserRepository;
@Service
public class UserServiceImpl implements UserService {
@Autowired
LoginRepository repo;
@Autowired
UserRepository obj;
	@Override
	public void register(Usertable user) {
		repo.save(user);
	}

	@Override
	public String validateUser(Login login) {
	if(obj.equals(login)) {
		return "Log in successful";
	}else
	{
		return "Log in not successful";
	}
		
		
	}

	@Override
	public void register(Login login) {
		obj.save(login);
	}
		
		
	}


