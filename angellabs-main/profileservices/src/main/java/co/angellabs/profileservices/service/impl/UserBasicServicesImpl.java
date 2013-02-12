package co.angellabs.profileservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import co.angellabs.entities.dto.User;
import co.angellabs.profileservices.dao.UserBasicServicesDAO;
import co.angellabs.profileservices.service.UserBasicServices;


public class UserBasicServicesImpl implements UserBasicServices {

	@Autowired
	private UserBasicServicesDAO userBasicServiceDAO;
	public User validateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean register(User user) {
		boolean isReg=userBasicServiceDAO.saveUser(user);
		return isReg;
	}

}
