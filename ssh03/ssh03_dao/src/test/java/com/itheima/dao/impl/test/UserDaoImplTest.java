package com.itheima.dao.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.bean.User;
import com.itheima.dao.UserDao;

/**  
 * ClassName:UserDaoImplTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 上午11:36:00 <br/>       
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext*.xml")
public class UserDaoImplTest {
	
	@Autowired
	private UserDao userDao;

	@Test
	public void testFindById() {
		User user = userDao.findById(1);
		assertEquals("zs", user.getUsername());
	}

}
  
