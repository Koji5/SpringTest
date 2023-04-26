package com.officeutq.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import com.officeutq.springtest.domain.test.IndexListDto;
/**
 * 
 * JUnitでのテスト用
 *
 */
@Controller
public class Test011Controller {
//	private final String SCREEN_ID = "Test011";

	@RequestMapping("/Test011")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
}
