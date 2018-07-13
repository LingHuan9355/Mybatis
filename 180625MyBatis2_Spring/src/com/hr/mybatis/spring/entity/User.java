package com.hr.mybatis.spring.entity;

import java.util.Date;
/**
 * 
 * @Name  : User
 * @Author : LH
 * @Date : 2018年7月12日 下午11:53:06
 * @Version : V1.0
 * 
 * @Description :
 */
public class User {

	/*
	  CREATE TABLE s_user(
		user_id INT AUTO_INCREMENT PRIMARY KEY,
		user_name VARCHAR(30),
		user_birthday DATE,
		user_salary DOUBLE
	)
	 */
	
	private int id;
	private String name;
	private Date birthday;
	private double salary;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, Date birthday, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday + ", salary=" + salary + "]";
	}

	
}
