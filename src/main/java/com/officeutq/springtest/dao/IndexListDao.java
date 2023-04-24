package com.officeutq.springtest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.officeutq.springtest.domain.test.IndexListDto;
import com.officeutq.springtest.mapper.test.IndexResultSetExtractor;
import com.officeutq.springtest.mapper.test.IndexRowMapper;

@Repository
public class IndexListDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

    public List<IndexListDto> findAll() {
        final String sql = "SELECT * From index_list ORDER BY screen_id Limit 10";
        return jdbcTemplate.query(sql, new IndexResultSetExtractor());
    }
    
    public IndexListDto findByScreenId(String screenId) {
    	String sql = "SELECT * FROM index_list WHERE screen_id='" + screenId + "'";
    	return jdbcTemplate.queryForObject(sql, new IndexRowMapper());
    }
}