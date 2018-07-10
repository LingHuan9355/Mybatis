package com.hr.mybatis.procedure.test8;


import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * @Name  : PUserProcedureTest8
 * @Author : LH
 * @Date : 2018年7月10日 下午11:18:26
 * @Version : V1.0
 * 
 * @Description : 8.测试调用存储过程
 */
public class PUserProcedureTest8 {

			@Test
			public void testPUserProcedure() throws IOException {
					SqlSessionFactory sqlSessionFactory = MyBatisUtils.getFactory();
					SqlSession sqlSession = sqlSessionFactory.openSession();
					
					String statement = "com.hr.mybatis.procedure.test8.UserMapper" + ".getUserCount";
					
					Map<String, Integer> parameterMap = new HashMap<String,Integer>();
					parameterMap.put("sexid", 0);
					parameterMap.put("usercount", -1);
					
					sqlSession.selectOne(statement, parameterMap);
					Integer result = parameterMap.get("usercount");
					System.out.println(result);
					
					sqlSession.close();
			}

}
