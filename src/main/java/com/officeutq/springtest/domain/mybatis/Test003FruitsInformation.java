package com.officeutq.springtest.domain.mybatis;

public class Test003FruitsInformation {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column test003_fruits_information.fruits_id
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	private String fruitsId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column test003_fruits_information.fruits_name
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	private String fruitsName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column test003_fruits_information.fruits_price
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	private Integer fruitsPrice;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column test003_fruits_information.fruits_id
	 * @return  the value of test003_fruits_information.fruits_id
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public String getFruitsId() {
		return fruitsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column test003_fruits_information.fruits_id
	 * @param fruitsId  the value for test003_fruits_information.fruits_id
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void setFruitsId(String fruitsId) {
		this.fruitsId = fruitsId == null ? null : fruitsId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column test003_fruits_information.fruits_name
	 * @return  the value of test003_fruits_information.fruits_name
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public String getFruitsName() {
		return fruitsName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column test003_fruits_information.fruits_name
	 * @param fruitsName  the value for test003_fruits_information.fruits_name
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void setFruitsName(String fruitsName) {
		this.fruitsName = fruitsName == null ? null : fruitsName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column test003_fruits_information.fruits_price
	 * @return  the value of test003_fruits_information.fruits_price
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public Integer getFruitsPrice() {
		return fruitsPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column test003_fruits_information.fruits_price
	 * @param fruitsPrice  the value for test003_fruits_information.fruits_price
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void setFruitsPrice(Integer fruitsPrice) {
		this.fruitsPrice = fruitsPrice;
	}
}