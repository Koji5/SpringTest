package com.officeutq.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Test003 データベース操作２
 * @author Koji Sakamoto
 *
 */
@Controller
public class Test003Controller {

	private final String SCREEN_ID = "Test003";
	
	@Autowired
	Test003Service service;
	
    @RequestMapping(value = "/" + SCREEN_ID, method = RequestMethod.GET)
    public String getSomething(Model model) {
		model.addAttribute("thisPage", service.findThisPart(SCREEN_ID));
		model.addAttribute("resultDto", service.resultDto());
		return SCREEN_ID;
    }
    
}
