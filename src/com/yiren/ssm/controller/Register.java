package com.yiren.ssm.controller;
import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.yiren.ssm.service.Userservice;
import com.yiren.ssm.vo.Person;


@Controller
public class Register {
	@Autowired
	Userservice userservice;
	@RequestMapping(value="gotoregister",method=RequestMethod.POST)
	public String register(Model model) {
		Person person=new Person();
		model.addAttribute(person);
		return "register";
	}
	@RequestMapping(value="register",method=RequestMethod.POST)
	public ModelAndView register(@Valid Person person,Errors errors,@RequestParam("user_id") String user_id,@RequestParam("user_password") String user_password) {
		ModelAndView mv = new ModelAndView();
		if(errors.hasErrors()) {
			mv.setViewName("register");
		}else {
		Person person1 =userservice.check(person);
			if(person1==null)
			{
				userservice.Register(person);
				mv.setViewName("login");
			}
			else
			{
				String msg="用户名已存在";
				mv.addObject("msg",msg);
				mv.setViewName("register");
			}}
		return mv;		
	}

	}
