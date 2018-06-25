package cn.fd.mybatis.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.fd.mybatis.mapper.UserMapper;
import cn.fd.mybatis.pojo.User;
import cn.fd.mybatis.pojo.UserExample;
import cn.fd.mybatis.pojo.UserExample.Criteria;

public class UserMapperTest {

	
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper mapper = (UserMapper) ac.getBean("userMapper");
		User user = mapper.selectByPrimaryKey(10);
		System.out.println(user);
	}
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper mapper = (UserMapper) ac.getBean("userMapper");
		UserExample example = new UserExample();
		example.createCriteria().andSexEqualTo("1").andUsernameLike("%陈%");
		List<User> list = mapper.selectByExample(example );
		for (User user2 : list) {
			
			System.out.println(user2);
		}
	}
	@Test
	public void test2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper mapper = (UserMapper) ac.getBean("userMapper");
		UserExample example = new UserExample();
		example.createCriteria().andSexEqualTo("1").andUsernameLike("%陈%");
		List<User> list1 = mapper.selectByExample(example );
		for (User user2 : list1) {
			System.out.println("hehahha");
			System.out.println(user2);
		}
	}
	

}
