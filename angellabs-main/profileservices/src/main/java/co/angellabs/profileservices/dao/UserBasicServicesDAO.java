package co.angellabs.profileservices.dao;

import co.angellabs.entities.dto.User;

public interface UserBasicServicesDAO {

	public boolean saveUser(User user);
	public User validateUserLogin(User user);
}
