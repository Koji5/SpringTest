package com.officeutq.springtest;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.officeutq.springtest.domain.mybatis.IndexList;
import com.officeutq.springtest.domain.mybatis.IndexListExample;
import com.officeutq.springtest.domain.test.Test005Dto;
import com.officeutq.springtest.mapper.mybatis.IndexListMapper;

/**
 * Test005 エラーページの実装
 * @author Koji Sakamoto
 *
 */
@Controller
@ControllerAdvice
public class Test005Controller {
	private final String SCREEN_ID = "Test005";

	@Autowired
	private IndexListMapper indexListMapper;

	@RequestMapping(value = "/" + SCREEN_ID, method = RequestMethod.GET)
    public String getSomething(Model model) {
		model.addAttribute("thisPage", findThisPart(SCREEN_ID));
		model.addAttribute("message", new Test005Dto());
		return SCREEN_ID;
    }
    
    public IndexList findThisPart(String screenId) {
    	IndexListExample example = new IndexListExample();
    	example.createCriteria().andScreenIdEqualTo(screenId);
    	List<IndexList> list = indexListMapper.selectByExample(example);
    	if (CollectionUtils.isEmpty(list)) {
    		  return null;
    		}
    	return list.get(0);
    }

    /**
     * すべてのコントローラーで共通する例外処理
     * @param e
     * @return
     */
	@ExceptionHandler
	public ModelAndView handleException(Exception e) {
		Test005Dto dto = new Test005Dto();
		dto.setStackTrace(getStackTrace(e));
		dto.setClassName(e.getClass().getName());
		dto.setMessage(e.getMessage());
		ModelAndView mav = new ModelAndView();
		mav.addObject("thisPage", findThisPart(SCREEN_ID));
		mav.addObject("message", dto);
		mav.setViewName(SCREEN_ID);
		return mav;
	}

	/**
	 * stackTraceを文字列化する
	 * @param e
	 * @return
	 */
    public static String getStackTrace(Exception e) {
    	 
    	StringWriter sw = new StringWriter();
    	PrintWriter pw = new PrintWriter(sw);
   		e.printStackTrace(pw);
   		String trace = sw.toString();
        try { 
        	if ( sw != null ) {
        		sw.flush();
        		sw.close();
        	} 
        	if ( pw != null ) {
        		pw.flush();
        		pw.close();
        	}
        } catch (IOException ignore){}
        return trace;
    }

}
