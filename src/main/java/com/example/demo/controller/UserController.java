package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Login;
import com.example.demo.model.Usertable;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
UserService userService;
@PostMapping("/register")
public void registerUser(@RequestBody Login lo) {
	userService.register(lo);
	System.out.println("Registered successfully");
}
@PostMapping("/login")
public String validate(@RequestBody Login login) {
	return userService.validateUser(login);
	
}
}