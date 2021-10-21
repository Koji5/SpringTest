package com.officeutq.springtest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.officeutq.springtest.domain.mybatis.IndexList;
import com.officeutq.springtest.domain.mybatis.IndexListExample;
import com.officeutq.springtest.domain.test.Test003ResultDto;
import com.officeutq.springtest.mapper.mybatis.IndexListMapper;
import com.officeutq.springtest.mapper.test.Test003Mapper;

@Service
public class Test003Service {
	
	@Autowired
	private Test003Mapper test003Mapper;
	
	@Autowired
	private IndexListMapper indexListMapper;

    public IndexList findThisPart(String screenId) {
    	IndexListExample example = new IndexListExample();
    	example.createCriteria().andScreenIdEqualTo(screenId);
    	List<IndexList> list = indexListMapper.selectByExample(example);
    	return list.get(0);
    }
    
    public List<Test003ResultDto> resultDto(){
    	return test003Mapper.selectAll();
    }

}
