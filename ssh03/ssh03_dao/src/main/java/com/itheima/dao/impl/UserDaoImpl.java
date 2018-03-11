package com.itheima.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.bean.User;
import com.itheima.dao.UserDao;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao  {

	public User findById(Integer id) {
		return getHibernateTemplate().get(User.class, id);
	}

}
  
