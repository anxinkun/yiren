package com.yiren.ssm.vo;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Person {
	@NotBlank(message="登录名不能为空")
	private String user_id;
	@Size(min=6,max=16,message="密码必须在6~16位")
	private String user_password;
	private String user_nickname;
	private Date user_birthday;
	private String user_gender;
	private int user_idcard_number;
	private String user_region;
	private Boolean VIP;
	
	public  String getUser_id() {
		return user_id;
	}

	public void setUser_id( String user_id) {
		this.user_id = user_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public Date getUser_birthday() {
		return user_birthday;
	}

	public void setUser_birthday(Date user_birthday) {
		this.user_birthday = user_birthday;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public int getUser_idcard_number() {
		return user_idcard_number;
	}

	public void setUser_idcard_number(int user_idcard_number) {
		this.user_idcard_number = user_idcard_number;
	}

	public String getUser_region() {
		return user_region;
	}

	public void setUser_region(String user_region) {
		this.user_region = user_region;
	}

	public Boolean getVIP() {
		return VIP;
	}

	public void setVIP(Boolean vIP) {
		VIP = vIP;
	}

	@Override
	public String toString() {
		return user_id+" "+user_password+" "+user_nickname+" "+user_birthday+" "+user_gender+" "+user_idcard_number+" "+user_region+" "+VIP;
	}

}
