package com.officeutq.springtest.mapper.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.officeutq.springtest.domain.test.IndexListDto;

/**
 * IndexListDtoのMapperクラス
 * @author Koji Sakamoto
 *
 */
public class IndexResultSetExtractor implements ResultSetExtractor<List<IndexListDto>> {

	@Override
	public List<IndexListDto> extractData(ResultSet rs) throws SQLException, DataAccessException {

		List<IndexListDto> indexList = new ArrayList<>();
		
		while(rs.next()) {
			
			IndexListDto list = new IndexListDto();
			
	        list.setScreenId(rs.getString("screen_id"));
	        list.setIndexTitle(rs.getString("index_title"));
	        list.setIndexExp(rs.getString("index_exp"));
	        list.setIndexDate(rs.getDate("index_date"));
	        list.setIndexMemo(rs.getString("index_memo"));

	        indexList.add(list);
		}
		
		return indexList;
	}

}
