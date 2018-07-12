package com.hr.mybatis.cache.test9;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.hr.mybatis.beans.CUser;
import com.hr.mybatis.util.MyBatisUtils;

/**
 * 
 * @Name  : CacheUserTest
 * @Author : LH
 * @Date : 2018年7月12日 下午10:53:01
 * @Version : V1.0
 * 
 * @Description : 9. Mybatis缓存
 * 1. 一级缓存 : session级的缓存 
 * 		1. 执行了session.clearCache();
 *		2. 执行CUD操作
 * 		3. 不是同一个Session对象
 * 2. 二级缓存: 是一个映射文件级的缓存
 * hibernate :二级缓存是sessionfactory，就整一个
 */
public class CacheUserTest {

		/**
		 * 9.2. Mybatis一级缓存
		 * 一级缓存: 也就Session级的缓存(默认开启)
		 */
	   @Test
	   public void testCacheOne() {
		   			SqlSessionFactory factory = MyBatisUtils.getFactory();
		   			SqlSession sqlSession = factory.openSession();
		   			
		   			String statement = "com.hr.mybatis.cache.test9.CUserMapper" + ".getUser";
		   			CUser cUser = sqlSession.selectOne(statement, 1);
		   			System.out.println(cUser);
		   			
		   			/**
		   			 * 一级缓存默认就会被使用
		   			 */
		   			cUser = sqlSession.selectOne(statement, 1);
		   			System.out.println(cUser);
		   			System.out.println("------------------");
		   			
		   		
		   			/**
		   		     * 1. 必须是同一个Session,如果session对象已经close()过了就不可能用了 
		   		     */
		   			/*sqlSession =factory.openSession();
		   			cUser = sqlSession.selectOne(statement, 1);
		   			System.out.println(cUser);
		   			sqlSession.close();*/
		   			
		   			/**
		   		     *2. 查询条件是一样的
		   		     */
		   			/* cUser = sqlSession.selectOne(statement,2);
		   			 System.out.println(cUser);*/
		   			
		   			/**
		   			 * 3. 没有执行过session.clearCache()清理缓存
		   			 */
		   			/*sqlSession.clearCache();
		   			cUser = sqlSession.selectOne(statement, 1);
		   			System.out.println(cUser);*/
		   			
		   			/**
		   			 *4. 没有执行过增删改的操作(这些操作都会清理缓存)
		   			 *执行CUD操作
		   			 */
		   		/*	sqlSession.update("com.hr.mybatis.cache.test9.CUserMapper.updateUser",new CUser(1,"Tom1",13));	
		   			sqlSession.commit();
		   			
		   			cUser = sqlSession.selectOne(statement,1);*/
		   			
		   			sqlSession.close();
		   			
	   	}
	   
		   /**
		    * 9.3. Mybatis二级缓存
		    */
	      @Test
	      public void testCacheTwo() {
	    	  SqlSessionFactory factory = MyBatisUtils.getFactory();
	   			SqlSession sqlSession1 = factory.openSession();
	   			SqlSession sqlSession2 = factory.openSession();
	   			
	   			String statement = "com.hr.mybatis.cache.test9.CUserMapper" + ".getUser";
	   			CUser cUser = sqlSession1.selectOne(statement, 3);
	   			sqlSession1.commit();
	   			System.out.println(cUser);
	   			System.out.println("------------------");
	   			
	   			cUser = sqlSession2.selectOne(statement, 3);
	   			sqlSession2.commit();
	   			System.out.println(cUser);
	   			
	      }
	   
}
