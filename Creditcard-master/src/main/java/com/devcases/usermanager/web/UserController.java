package com.devcases.usermanager.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devcases.usermanager.model.User;
import com.devcases.usermanager.service.UserService;



/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * Simply selects the home view to render by returning its name. Getting the
	 * Homepage
	 * 
	 */

	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public String home(Model model) {

		return "home";
	}

	@RequestMapping(value = "/checkEligibility", method = RequestMethod.POST)
	public String checkEligibility(Model model, User user) {

		// System.out.println("Coming value:" + user.getPannumber());

		// model.addAttribute("users", userService.getAllUser(user.getPannumber()));

		String initialPanNumber = user.getPannumber().toUpperCase();
		String returnPage = "";

		if (userService.getAllUser(initialPanNumber).isEmpty()) {
			returnPage = "invalid";
		} else {
			
			String pannumber = userService.getAllUser(initialPanNumber).get(0).getPannumber();
			float creditscore = Float.valueOf(userService.getAllUser(initialPanNumber).get(0).getCreditscore());
			System.out.println("Pannumber:" + pannumber);
			System.out.println("creditscore:" + creditscore);
			
			if (creditscore >= 5) {
				model.addAttribute("message", "Congratulations!!! You are eligible for a credit card");
				returnPage = "Eligibility";
			} else if (creditscore < 5) {
				model.addAttribute("message", "Sorry!!! You are not eligible for a credit card");
				returnPage = "Eligibility";
			}
		}

		return returnPage;
	}

}
