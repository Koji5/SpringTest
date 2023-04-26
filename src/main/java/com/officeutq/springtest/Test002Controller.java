package com.officeutq.springtest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.officeutq.springtest.domain.test.IndexListDto;
import com.officeutq.springtest.mapper.test.IndexResultSetExtractor;

/**
 * Test002 データベース操作１
 * @author Koji Sakamoto
 *
 */
@Controller
public class Test002Controller {
	
	private final String SCREEN_ID = "Test002";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
    @RequestMapping(value = "/" + SCREEN_ID, method = RequestMethod.GET)
    public String getSomething(Model model) {
		model.addAttribute("thisPage", findThisPart());
		return SCREEN_ID;
    }
	
    private IndexListDto findThisPart() {
    	String sql = "SELECT * FROM index_list WHERE screen_id='" + SCREEN_ID + "'";
    	IndexResultSetExtractor extractor = new IndexResultSetExtractor();
    	List<IndexListDto> list = jdbcTemplate.query(sql, extractor);
    	return list.get(0);
    }

}
