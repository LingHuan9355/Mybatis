package com.hr.mybatis.beans;

import java.io.Serializable;

/**
 * 
 * @Name  : CUser
 * @Author : LH
 * @Date : 2018年7月12日 下午10:46:37
 * @Version : V1.0
 * 
 * @Description :
 */
public class CUser implements Serializable{
			
	private int id;
	private String name;
	private int age;
	
	public CUser(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public CUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "CUser [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	
}
