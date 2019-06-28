package com.yiren.ssm.controller;

import java.io.IOException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yiren.ssm.service.Userservice;
import com.yiren.ssm.vo.Person;

@Controller
public class Login {
	@Autowired
	Userservice userservice;
	@RequestMapping(value="gotologin",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String Login(HttpServletRequest req, HttpServletResponse resp)throws  IOException{
		String user_id= req.getParameter("user_id");	
		String user_password= req.getParameter("user_password");
		Person person=new Person();
		person.setUser_id(user_id);
		person.setUser_password(user_password);
		Person person1=userservice.Login(person);
		if(person1 !=null) {
			//登录成功后，将用户名信息存入会话
			HttpSession session=req.getSession();
			session.setAttribute("person1", person1);
			return "Success";
		}else {
			req.setAttribute("message", "用户名或者密码不正确，请重新输入！");
			return "login";
		}
		
		
	} 
}
