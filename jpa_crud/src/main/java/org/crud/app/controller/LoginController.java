package org.crud.app.controller;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.crud.app.model.Login;
import org.crud.app.service.LoginService;

@RestController
@RequestMapping("/user")

public class LoginController {
	@Autowired
	private LoginService lser;
	@PostMapping("/log")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String usrname=loginData.get("usrname");
		String psword=loginData.get("psword");
		String result=lser.checkLogin(usrname,psword);
		return result;
	}
	@PostMapping("/addu")
	public Login AddUser(@RequestBody Login cl)
	{
		return lser.addUser(cl);
	}

	@GetMapping
	public List<Login> listAll()
	{
		return lser.getUser();
	}

}