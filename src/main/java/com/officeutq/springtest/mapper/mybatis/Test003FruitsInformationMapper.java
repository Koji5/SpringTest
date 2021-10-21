package com.officeutq.springtest.mapper.mybatis;

import com.officeutq.springtest.domain.mybatis.Test003FruitsInformation;
import com.officeutq.springtest.domain.mybatis.Test003FruitsInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Test003FruitsInformationMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_information
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	long countByExample(Test003FruitsInformationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_information
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	int deleteByExample(Test003FruitsInformationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_information
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	int deleteByPrimaryKey(String fruitsId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_information
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	int insert(Test003FruitsInformation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_information
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	int insertSelective(Test003FruitsInformation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_information
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	List<Test003FruitsInformation> selectByExample(Test003FruitsInformationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_information
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	Test003FruitsInformation selectByPrimaryKey(String fruitsId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_information
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	int updateByExampleSelective(@Param("record") Test003FruitsInformation record,
			@Param("example") Test003FruitsInformationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_information
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	int updateByExample(@Param("record") Test003FruitsInformation record,
			@Param("example") Test003FruitsInformationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_information
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	int updateByPrimaryKeySelective(Test003FruitsInformation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_information
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	int updateByPrimaryKey(Test003FruitsInformation record);
}