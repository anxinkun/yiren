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
public class Logoff {
	@Autowired
	Userservice userservice;
	@RequestMapping(value="logoff",method=RequestMethod.GET)
	public String Logoff(HttpServletRequest req, HttpServletResponse resp)throws  IOException{
		HttpSession session=req.getSession();
		session.setMaxInactiveInterval(1);
		req.setAttribute("message", "已经登出，请重新登录。");
		return "login";
		
		
	} 
}
