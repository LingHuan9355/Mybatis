package com.hr.mybatis.annotation.test3;


import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hr.mybatis.beans.User;
import com.hr.mybatis.util.MyBatisUtils;

/**
 * 
 * @Name  : UserTest3
 * @Author : LH
 * @Date : 2018年7月3日 下午11:38:44
 * @Version : V1.0
 * 
 * @Description :  3.2. 注解的实现 
 * 							 测试: CRUD操作的注解的实现
 */
public class UserTest3 {

			@Test
			public void testAdd() throws IOException {
						SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
						//默认手动提交,可以设置为自动提交 true
						SqlSession sqlSession = sqlSessionFactory.openSession(true);
						
						UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
						
						int row =userMapper.add(new User(-1,"Carl",25));

						System.out.println(row);
						sqlSession.close();
			
			}
			
			@Test
			public void testUpdate() throws IOException {
				SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
				//默认手动提交,可以设置为自动提交 true
				SqlSession sqlSession = sqlSessionFactory.openSession(true);
				
				UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
				int row = userMapper.update(new User(5,"Mr.Carl",26));

				System.out.println(row);
				sqlSession.close();
				
			}
			
			@Test
			public void testDelete() {
				 SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
				 SqlSession sqlSession = sqlSessionFactory.openSession(true);
				 
				 UserMapper userMapper = sqlSession.getMapper(UserMapper.class);	
				 int row = userMapper.delete(5);
				 sqlSession.close();
				 System.out.println(row);
			}
			
			@Test
			public void testGetUser() {
				SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
				SqlSession sqlSession = sqlSessionFactory.openSession(true);
				
				UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
				User user= userMapper.getById(2);
				sqlSession.close();
				System.out.println(user);
			}
			
			@Test
			public void testGetAllUser() {
				SqlSessionFactory sqlSessionFactory= MyBatisUtils.getFactory();
				SqlSession sqlSession = sqlSessionFactory.openSession(true);
				
				UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
				List<User> list = userMapper.getAll();
				
				sqlSession.close();
				System.out.println(list);
			}

}
