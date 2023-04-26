package com.officeutq.springtest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.web.servlet.MockMvc;

import com.officeutq.springtest.dao.IndexListDao;
import com.officeutq.springtest.mapper.test.IndexRowMapper;
import com.officeutq.springtest.domain.test.IndexListDto;

@SpringBootTest
@AutoConfigureMockMvc
class Test010ControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@MockBean
	private IndexListDao service;

	@Test
	void test() throws Exception {
    	String sql = "SELECT * FROM index_list WHERE screen_id='Test001'";
		IndexListDto dto = jdbcTemplate.queryForObject(sql, new IndexRowMapper());
		when(service.findByScreenId("Test010")).thenReturn(dto);
	    this.mockMvc.perform(get("/Test010"))
        .andExpect(status().isOk()).andExpect(content().string(containsString("Test001")));
	}

}
