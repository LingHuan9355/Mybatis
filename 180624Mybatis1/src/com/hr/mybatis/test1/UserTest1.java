package com.hr.mybatis.test1;


import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hr.mybatis.beans.User;
import com.hr.mybatis.xml.test2.UserTest2;

/**
 * 
 * @Name  : UserTest1
 * @Author : LH
 * @Date : 2018年7月3日 下午10:35:23
 * @Version : V1.0
 * 
 * @Description : mybatis快速入门
 *
 * 2.7.	编写测试代码：执行定义的select语句
 */
public class UserTest1 {

			@Test
			public void test() throws IOException {
			//	String resource = "myBatis-conf.xml"; 
				//加载mybatis的配置文件（它也加载关联的映射文件）
			//	Reader reader = Resources.getResourceAsReader(resource); 
				//构建sqlSession的工厂
			//	SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
				//创建能执行映射文件中sql的sqlSession
			//	SqlSession session = sessionFactory.openSession();
				//映射sql的标识字符串
			//	String statement = "com.hr.mybatis.beans.test1.userMapper"+".selectUser";
				//执行查询返回一个唯一user对象的sql
			//	User user = session.selectOne(statement, 1);
			//	System.out.println(user);
				
				String resource = "myBatis-conf.xml"; 
				
				//加载mybatis的配置文件（它也加载关联的映射文件）
				InputStream is = UserTest2.class.getClassLoader().getResourceAsStream(resource);
				//构建sqlSession的工厂
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
				//创建能执行映射文件中sql的sqlSession
				SqlSession sqlSession = sessionFactory.openSession();
				//映射sql的标识字符串
				String statement  = "com.hr.mybatis.test1.userMapper" + ".getUser";
				//执行查询返回一个唯一user对象的sql
				User user = sqlSession.selectOne(statement, 2);
				
				System.out.println(user);
			
			}

}
