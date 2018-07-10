package com.hr.mybatis.beans;

/**
 * 
 * @Name  : ConditionUser
 * @Author : LH
 * @Date : 2018年7月10日 下午10:36:46
 * @Version : V1.0
 * 
 * @Description : 查询条件实体类
 */
public class ConditionUser {

	
	private String name;
	private int minAge;
	private int maxAge;

	
	public ConditionUser() {
		super();
	}
	public ConditionUser(String name, int minAge, int maxAge) {
		super();
		this.name = name;
		this.minAge = minAge;
		this.maxAge = maxAge;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
