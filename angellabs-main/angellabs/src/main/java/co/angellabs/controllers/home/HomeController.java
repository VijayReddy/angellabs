package co.angellabs.controllers.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.angellabs.framework.controller.BaseController;


@Controller
@RequestMapping("/Home")
public class HomeController implements BaseController {
	
			
	@RequestMapping(value="/index.htm",method=RequestMethod.GET)
	public String homePage() {
			
		return "index";
	}
	public String aboutUs() {
		/* ################################### */
		ModelMap modelMap=new ModelMap();
		
		return null;
	}

	public String help() {
		// TODO Auto-generated method stub
		return null;
	}

	public ModelAndView getReviews() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getBlog() {
		
		return null;
	}

	public ModelAndView signUpWithTwitter() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getApi() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTermsandConditions() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
