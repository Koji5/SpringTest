package com.officeutq.springtest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author koji_
 *
 */
@Controller
public class Test008Controller {
	
	private final String SCREEN_ID = "Test008";
  
	@Autowired
    IndexListRepository indexListRepository;
	
    @RequestMapping(value = "/" + SCREEN_ID, method = RequestMethod.GET)
    public String getSomething(Model model) {
    	model.addAttribute("indexListDto", findAll());
        model.addAttribute("thisPage", findThisPart());
        return SCREEN_ID;
    }

    private List<IndexListDto> findAll() {
    	List<IndexListDto> list = indexListRepository.findAll(Sort.by(Sort.Direction.ASC, "screenId"));
		return list;
    }
    private IndexListDto findThisPart() {
        IndexListDto dto = indexListRepository.findByScreenId(SCREEN_ID);
        return dto;
    }
}
