package co.angellabs.profileservices.service;

import co.angellabs.entities.dto.User;

public interface UserBasicServices  {

	public User validateUser(User user);
	
	public boolean register( User user);
}
