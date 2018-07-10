package com.hr.mybatis.beans;

/**
 * 
 * @Name  : PUser
 * @Author : LH
 * @Date : 2018年7月10日 下午11:17:12
 * @Version : V1.0
 * 
 * @Description :
 */
public class PUser {

	private String id;
	private String name;
	private String sex;
	
	
	public PUser() {
		super();
	}
	public PUser(String id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "PUser [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}

		
	 
}
