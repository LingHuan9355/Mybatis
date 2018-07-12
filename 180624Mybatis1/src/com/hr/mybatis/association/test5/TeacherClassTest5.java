package com.hr.mybatis.association.test5;


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
 * @Name  : TeacherClassTest5
 * @Author : LH
 * @Date : 2018年7月4日 下午11:45:42
 * @Version : V1.0
 * 
 * @Description :   测试: 一对一关联表查询
 */
public class TeacherClassTest5 {

			@Test
			public void testClass() throws IOException {
					SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
					SqlSession sqlSession = sqlSessionFactory.openSession(true);
					
					String statement = "com.hr.mybatis.association.test5.ClassMapper" + ".getClass";
					 statement = "com.hr.mybatis.association.test5.ClassMapper" + ".getClass2";
					
					Classes classes = sqlSession.selectOne(statement, 1);
					System.out.println(classes);
					sqlSession.close();
					
			}

}
