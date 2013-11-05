package com.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.mvc.dao.IUserDao;
import com.spring.mvc.entity.User;

@Controller
@RequestMapping(value="/")
@Configuration
@ComponentScan("com.spring.mvc.dao")
public class MyController {
	
	@Autowired
	private IUserDao userDao;

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String myTest(ModelMap model){
		model.addAttribute("amessage","This is a message from the controller");
		
		//List<User>users=userDao.findAll();
		//model.addAttribute("users",users);
		
		return "springtest";
	}
	
	
	@RequestMapping(value="/allusers",method=RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public List<User> getAllUsers(){
		return userDao.findAll();		
	}
}
