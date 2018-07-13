package com.hr.mybatis.spring.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hr.mybatis.spring.entity.User;
import com.hr.mybatis.spring.mapper.UserMapper;

/**
 * 
 * @Name  : SMTest
 * @Author : LH
 * @Date : 2018年7月13日 上午12:32:02
 * @Version : V1.0
 * 
 * @Description :10. spring集成mybatis
 */

@RunWith(SpringJUnit4ClassRunner.class) //使用Springtest测试框架
@ContextConfiguration("/beans.xml")  //加载配置
public class SMTest {

			@Autowired
			private UserMapper userMapper;
	
			@Test
			public void testAdd() {
				User user = new User(-1,"Jack",new Date(), 9000);
				userMapper.save(user);
			}
			
			@Test
			public void testUpdate() {
				User user = new User(1,"Tom",new Date(), 12222);
				userMapper.update(user);
			}
			
			@Test
			public void testDelete() {
				userMapper.delete(5);
			}
			
			@Test
			public void testfindById() {
				User user =userMapper.findById(3);
				System.out.println(user);
			}
			
			@Test
			public void testfindAll() {
				List<User> list = userMapper.findAll();
				for (User user : list) {
					System.out.println(user);
				}
			}
}
