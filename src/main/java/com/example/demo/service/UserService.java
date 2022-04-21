package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.model.Usertable;

@Service
public interface UserService  {
void register(Usertable user);
String validateUser(Login login);
void register(Login login);
}
