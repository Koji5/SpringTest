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

@Controller
public class IndexController {

	private final String SCREEN_ID = "Index";
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getSomething(Model model) {
		model.addAttribute("indexListDto", findAll());
		return SCREEN_ID;
	}

    private List<IndexListDto> findAll() {
    	String sql = "SELECT * FROM index_list ORDER BY screen_id";
    	IndexResultSetExtractor extractor = new IndexResultSetExtractor();
    	List<IndexListDto> list = jdbcTemplate.query(sql, extractor);
    	return list;
    }

}
