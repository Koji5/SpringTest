package com.officeutq.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Test006Controller {
	
	private final String SCREEN_ID = "Test006";

//	@Autowired
//	Test006Service service;
	
    @RequestMapping(value = "/" + SCREEN_ID, method = RequestMethod.GET)
    public String getSomething(Model model) {
//		model.addAttribute("thisPage", service.findThisPart(SCREEN_ID));
//		model.addAttribute("userRecords", service.getUserRecords());
		return SCREEN_ID;
    }
}
