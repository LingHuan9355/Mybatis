package com.hr.mybatis.xml.test2;


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
 * @Name  : UserTest2
 * @Author : LH
 * @Date : 2018年7月3日 下午10:35:44
 * @Version : V1.0
 * 
 * @Description :   3 测试: CRUD操作的XML的实现
 * 		3.1. XML的实现
 * 			1). 定义sql映射xml文件：
 * 			2). 在config.xml中注册这个映射文件
 * 			3). 在dao中调用：
 */
public class UserTest2 {

			@Test
			public void testAdd() throws IOException {
						SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
						//默认手动提交
						SqlSession sqlSession = sqlSessionFactory.openSession();
						
						String statement = "com.hr.mybatis.xml.test2.userMapper" + ".addUser" ;
						int row = sqlSession.insert(statement, new User(-1,"Carl",25));
						//提交
						sqlSession.commit();
						sqlSession.close();
						System.out.println(row);
			
			}
			
			@Test
			public void testUpdate() throws IOException {
				SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
				//默认手动提交,可以设置为自动提交 true
				SqlSession sqlSession = sqlSessionFactory.openSession(true);
				
				String statement = "com.hr.mybatis.xml.test2.userMapper" + ".updateUser" ;
				int row = sqlSession.update(statement, new User(4,"Mr.Carl",26));
				//提交
				//sqlSession.commit();
				sqlSession.close();
				System.out.println(row);
				
			}
			
			@Test
			public void testDelete() {
				 SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
				 SqlSession sqlSession = sqlSessionFactory.openSession(true);
				 
				 String statement = "com.hr.mybatis.xml.test2.userMapper" + ".deleteUser";
				 int row = sqlSession.delete(statement,4);
				 sqlSession.close();
				 System.out.println(row);
			}
			
			@Test
			public void testGetUser() {
				SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
				SqlSession sqlSession = sqlSessionFactory.openSession(true);
				
				String statement = "com.hr.mybatis.xml.test2.userMapper" + ".getUser";
				User user= sqlSession.selectOne(statement, 2);
				sqlSession.close();
				System.out.println(user);
			}
			
			@Test
			public void testGetAllUser() {
				SqlSessionFactory sqlSessionFactory= MyBatisUtils.getFactory();
				SqlSession sqlSession = sqlSessionFactory.openSession(true);
				
				String statement = "com.hr.mybatis.xml.test2.userMapper" + ".getAllUsers";
				List<User> list = sqlSession.selectList(statement);
				
				sqlSession.close();
				System.out.println(list);
			}

}
