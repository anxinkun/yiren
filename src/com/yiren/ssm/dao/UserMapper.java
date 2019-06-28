package com.yiren.ssm.dao;


import com.yiren.ssm.vo.Person;

public interface UserMapper {
	
	public Person Login(Person person);
	public Person check(Person person);
	public void Register(Person person);
	

}
