package com.hr.mybatis.column.test4;


import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hr.mybatis.beans.Order;
import com.hr.mybatis.beans.User;
import com.hr.mybatis.util.MyBatisUtils;
import com.hr.mybatis.xml.test2.UserTest2;

/**
 * 
 * @Name  : OrderTest4
 * @Author : LH
 * @Date : 2018年7月4日 下午11:08:32
 * @Version : V1.0
 * 
 * @Description :  5. 解决字段名与实体类属性名不相同的冲突
 */
public class OrderTest4 {

			@Test
			public void testOrder() throws IOException {
					SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
					SqlSession sqlSession = sqlSessionFactory.openSession(true);
					
					String statement = "com.hr.mybatis.column.test4.orderMapper" + ".getOrder";
				     statement = "com.hr.mybatis.column.test4.orderMapper" + ".getOrder2";
					
					Order order = sqlSession.selectOne(statement, 3);
					sqlSession.close();
					System.out.println(order);
					
			}

}
