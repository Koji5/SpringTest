package com.officeutq.springtest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.officeutq.springtest.domain.mybatis.IndexList;
import com.officeutq.springtest.domain.mybatis.IndexListExample;
import com.officeutq.springtest.mapper.mybatis.IndexListMapper;

/**
 * 
 * @author koji_
 *
 */
@Controller
public class Test009Controller {

	private final String SCREEN_ID = "Test009";
	
	@Autowired
	private IndexListMapper indexListMapper;


	@RequestMapping(value = "/" + SCREEN_ID, method = RequestMethod.GET)
	public String getSomething(Model model) {
		model.addAttribute("indexListDto", findAll());
		model.addAttribute("thisPage", findThisPart());
		return SCREEN_ID;
	}

	private List<IndexList> findAll() {
    	IndexListExample example = new IndexListExample();
    	example.setOrderByClause("screen_id");
    	List<IndexList> list = indexListMapper.selectByExample(example);
		return list;

	}
	
	private IndexList findThisPart() {
		return indexListMapper.selectByPrimaryKey(SCREEN_ID);
		
	}
}
