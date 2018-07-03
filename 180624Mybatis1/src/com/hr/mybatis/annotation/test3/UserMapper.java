package com.hr.mybatis.annotation.test3;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hr.mybatis.beans.User;

/**
 * 
 * @Name  : UserMapper
 * @Author : LH
 * @Date : 2018年7月3日 下午11:33:37
 * @Version : V1.0
 * 
 * @Description : 定义sql映射的接口
 */
public interface UserMapper {

	  		@Insert("insert into users (name , age) values (#{name} , #{age})")
			public int add(User user);
			
	  		@Update("update users set name = #{name} , age = #{age}  where id = #{id}")
			public int update(User user);
			
	  		@Delete("delete from users where id = #{id}")
			public int  delete(int id);
			
	  		@Select("select  *  from users where id= #{id}")
			public User getById(int id);
			
	  		@Select("select  *  from users")
			public List<User> getAll();
}
