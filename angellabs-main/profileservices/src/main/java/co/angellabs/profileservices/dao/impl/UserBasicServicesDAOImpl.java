package co.angellabs.profileservices.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import co.angellabs.entities.dto.User;

import co.angellabs.profileservices.dao.UserBasicServicesDAO;


public class UserBasicServicesDAOImpl implements UserBasicServicesDAO  {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public boolean saveUser(User user) {
		
		/*String sqlqry="INSERT INTO users (username, password, email) VALUES ("+user.getName()+","+user.getPassword()+","+user.getEmail()+")";*/
		hibernateTemplate.save(user);
		
		return true;

	}
	
	public User validateUserLogin(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
