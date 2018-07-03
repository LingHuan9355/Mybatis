package com.hr.mybatis.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hr.mybatis.test1.UserTest1;

/**
 * 
 * @Name  : MyBatisUtils
 * @Author : LH
 * @Date : 2018年7月3日 下午10:47:42
 * @Version : V1.0
 * 
 * @Description :  工具类
 */
public class MyBatisUtils {
	
	
				public static SqlSessionFactory  getFactory() {
					String resource = "myBatis-conf.xml"; 
					
					//加载mybatis的配置文件（它也加载关联的映射文件）
					InputStream is = UserTest1.class.getClassLoader().getResourceAsStream(resource);
					//构建sqlSession的工厂
					SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
					
					return sessionFactory;
				}
}
