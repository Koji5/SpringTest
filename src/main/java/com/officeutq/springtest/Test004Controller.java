package com.officeutq.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Test004 WebFormテスト
 * @author Koji Sakamoto
 *
 */
@Controller
public class Test004Controller {
	private final String SCREEN_ID = "Test004";
	
	@Autowired
	Test004Service service;
	
    @RequestMapping(value = "/" + SCREEN_ID, method = RequestMethod.GET)
    public String getSomething(Model model) {
		model.addAttribute("thisPage", service.findThisPart(SCREEN_ID));
		model.addAttribute("idList", service.getIndexList());
		return SCREEN_ID;
    }
    
    /**
     * 画面IDに対応したindexListのレコードを返却する
     * @return Test004Dto(JSON形式)
     */
    //JSON文字列を返却するために、@ResponseBodyアノテーションを付与
    @GetMapping(value = "/Test004/changeScreenId")
    @ResponseBody
    public String changeScreenId(String idData){
    	return service.getJsonRecord(idData);
    }
    
    /**
     * 画面からデータを受け取り、データベースを更新する
     * @param updateDate(JSON形式)
     * @return
     */
    @PostMapping(value = "/Test004/postRecordData")
    @ResponseBody
    public String postRecordData(String updateDate) {
    	return service.updateIndexList(updateDate);
    }

}
