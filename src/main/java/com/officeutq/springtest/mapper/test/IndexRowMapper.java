package com.officeutq.springtest.mapper.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.officeutq.springtest.domain.test.IndexListDto;

public class IndexRowMapper implements RowMapper<IndexListDto> {

	@Override
	public IndexListDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		IndexListDto index = new IndexListDto();
		index.setScreenId(rs.getString("screen_id"));
		index.setIndexTitle(rs.getString("index_title"));
		index.setIndexExp(rs.getString("index_exp"));
		index.setIndexDate(rs.getDate("index_date"));
		index.setIndexMemo(rs.getString("index_memo"));
		return index;
	}

}
