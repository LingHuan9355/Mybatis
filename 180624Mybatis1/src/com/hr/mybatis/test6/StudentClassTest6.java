package com.hr.mybatis.test6;


import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hr.mybatis.beans.Classes;
import com.hr.mybatis.beans.Order;
import com.hr.mybatis.beans.User;
import com.hr.mybatis.util.MyBatisUtils;
import com.hr.mybatis.xml.test2.UserTest2;

/**
 * 
 * @Name  : StudentClassTest6
 * @Author : LH
 * @Date : 2018年7月6日 下午11:38:37
 * @Version : V1.0
 * 
 * @Description :测试: 一对多关联表查询
 */
public class StudentClassTest6 {

			@Test
			public void testClass() throws IOException {
					SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
					SqlSession sqlSession = sqlSessionFactory.openSession(true);
					
					String statement = "com.hr.mybatis.test6.ClassMapper" + ".getClass";
					
					Classes classes = sqlSession.selectOne(statement, 1);
					System.out.println(classes);
					sqlSession.close();
					
			}
			@Test
			public void testClass2() throws IOException {
				SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
				SqlSession sqlSession = sqlSessionFactory.openSession(true);
				
				String statement = "com.hr.mybatis.test6.ClassMapper" + ".getClass2";
				
				Classes classes = sqlSession.selectOne(statement, 2);
				System.out.println(classes);
				sqlSession.close();
				
			}

}
