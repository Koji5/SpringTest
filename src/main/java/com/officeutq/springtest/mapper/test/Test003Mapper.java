package com.officeutq.springtest.mapper.test;

import java.util.List;

import com.officeutq.springtest.domain.test.Test003ResultDto;

public interface Test003Mapper {

	/**
	 * すべてのレコードを取得します。
	 * @return
	 */
	List<Test003ResultDto> selectAll();

}
