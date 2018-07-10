package com.hr.mybatis.beans;

/**
 * 
 * @Name  : User
 * @Author : LH
 * @Date : 2018年7月10日 下午10:39:45
 * @Version : V1.0
 * 
 * @Description : 	定义表所对应的实体类
 */
public class User {
//shift +alt + s
			
			private int id;
			private String name;
			private int age;
			
			  public User() {
				super();
			}

 			public User(int id, String name, int age) {
				super();
				this.id = id;
				this.name = name;
				this.age = age;
			}

			//get,set方法
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
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}

			@Override
			public String toString() {
				return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
			}
			
		  
			
}
