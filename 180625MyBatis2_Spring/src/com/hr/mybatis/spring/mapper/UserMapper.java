package com.hr.mybatis.spring.mapper;

import java.util.List;

import com.hr.mybatis.spring.entity.User;

public interface UserMapper {

		void save(User user);
		
		void update(User user);
		
		void delete(int id);
		
		User findById(int id);
		
		List<User> findAll();

}
