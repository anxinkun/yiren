package com.yiren.ssm.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiren.ssm.dao.UserMapper;
import com.yiren.ssm.vo.Person;


@Service
public class Userservice {
	@Autowired
	UserMapper userMapper;
	public Person Login(Person person)
	{
		return userMapper.Login(person);
	}
	public Person check(Person person) 
	{
		return userMapper.check(person);
		
	}
	public void Register(Person person)
	{
		userMapper.Register(person);
	}
}