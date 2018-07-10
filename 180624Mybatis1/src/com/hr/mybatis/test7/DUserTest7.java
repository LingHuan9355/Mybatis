package com.hr.mybatis.test7;


import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hr.mybatis.beans.Classes;
import com.hr.mybatis.beans.ConditionUser;
import com.hr.mybatis.beans.Order;
import com.hr.mybatis.beans.User;
import com.hr.mybatis.util.MyBatisUtils;
import com.hr.mybatis.xml.test2.UserTest2;

/**
 * 
 * @Name  : DUserTest7
 * @Author : LH
 * @Date : 2018年7月10日 下午10:45:04
 * @Version : V1.0
 * 
 * @Description :  测试: 动态SQL与模糊查询
 */
public class DUserTest7 {

			@Test
			public void testUser() throws IOException {
					SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
					SqlSession sqlSession = sqlSessionFactory.openSession();
					
					String statement = "com.hr.mybatis.test7.UserMapper" + ".getUser";
					
					String name = "o";
					name =null;
					ConditionUser parameter = new ConditionUser("%"+name+"%", 13, 18);
					
					List<User> list = sqlSession.selectList(statement, parameter);
					System.out.println(list);
					
					sqlSession.close();
			}

}
