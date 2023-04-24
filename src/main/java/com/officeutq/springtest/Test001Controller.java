package com.officeutq.springtest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.officeutq.springtest.domain.test.IndexListDto;
import com.officeutq.springtest.mapper.test.IndexResultSetExtractor;

/**
 * Test001 データベース接続テスト
 * @author Koji Sakamoto
 *
 */
@Controller
public class Test001Controller {

	private final String SCREEN_ID = "Test001";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
    @RequestMapping(value = "/" + SCREEN_ID, method = RequestMethod.GET)
    public String getSomething(Model model) {
		model.addAttribute("indexListDto", findAll());
		model.addAttribute("thisPage", findThisPart());
		return SCREEN_ID;
    }
	
    public IndexListDto findThisPart() {
    	String sql = "SELECT * FROM index_list WHERE screen_id='" + SCREEN_ID + "'";
    	IndexResultSetExtractor extractor = new IndexResultSetExtractor();
    	List<IndexListDto> list = jdbcTemplate.query(sql, extractor);
    	return list.get(0);
    }
    
    private List<IndexListDto> findAll() {
        final String sql = "SELECT * From index_list ORDER BY screen_id Limit 10";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        List<IndexListDto> indexList = new ArrayList<>();
        for (Map<String, Object> map : list) {
            IndexListDto index = createIndex(map);
            indexList.add(index);
        }
        return indexList;
    }
    
    private IndexListDto createIndex(Map<String, Object> map) {
    	IndexListDto list = new IndexListDto();
        list.setScreenId((String)map.get("screen_id"));
        list.setIndexTitle((String)map.get("index_title"));
        list.setIndexExp((String)map.get("index_exp"));
        list.setIndexDate((Date)map.get("index_date"));
        list.setIndexMemo((String)map.get("index_memo"));
        return list;
    }

}
