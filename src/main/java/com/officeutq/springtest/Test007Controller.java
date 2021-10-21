package com.officeutq.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * LINE Fukuoka コーディングテスト用
 * @author Koji Sakamoto
 *
 */
@Controller
public class Test007Controller {

	private final String SCREEN_ID = "Test007";
	
	@Autowired
	Test007Service service;
	
    @RequestMapping(value = "/" + SCREEN_ID, method = RequestMethod.GET)
    public String getSomething(Model model) {
		model.addAttribute("thisPage", service.findThisPart(SCREEN_ID));
		model.addAttribute("resultDto", service.resultDto());
		return SCREEN_ID;
    }

}
