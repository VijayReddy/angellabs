package co.angellabs.controllers.profile;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.angellabs.entities.dto.User;
import co.angellabs.framework.controller.AuthenticationController;
import co.angellabs.profileservices.service.UserBasicServices;

@Controller
@RequestMapping("/User")
public class UserController extends AuthenticationController  {

	/*
	 * Login controlling
	 */
	
	@Autowired
	private UserBasicServices userBasicServices;
	
	@RequestMapping(value="/login.htm", method=RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelMap model = new ModelMap();
		
		return new ModelAndView("login",model);
	}
	
	public ModelAndView validateUserLogin(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	/*
	 * Registering controlling
	 */
	@RequestMapping(value="/register.htm", method=RequestMethod.GET)
	public ModelAndView joinUser(@ModelAttribute("register") User user, ModelMap model) {
		
		
		return new ModelAndView("userRegistration",model);
	}
		

	/*
	 * Other operations
	 */
	
	@RequestMapping(value="/adduser.htm")
	public ModelAndView addUser(User user, ModelMap model) {
		
			boolean isReg = userBasicServices.register(user);
			
			return new ModelAndView("index",model);
	}
		
	public ModelAndView deleteUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
