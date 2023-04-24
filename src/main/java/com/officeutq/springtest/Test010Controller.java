package com.officeutq.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.officeutq.springtest.dao.IndexListDao;

/**
 * 
 * JdbcTemplate のデータベース接続テストdao使用バージョン
 *
 */
@Controller
public class Test010Controller {

	private final String SCREEN_ID = "Test010";

	@Autowired
	private IndexListDao indexListDao;

	@RequestMapping(value = "/" + SCREEN_ID, method = RequestMethod.GET)
	public String getSomething(Model model) {
		model.addAttribute("indexListDto", indexListDao.findAll());
		model.addAttribute("thisPage", indexListDao.findByScreenId(SCREEN_ID));
		return SCREEN_ID;
	}

}
