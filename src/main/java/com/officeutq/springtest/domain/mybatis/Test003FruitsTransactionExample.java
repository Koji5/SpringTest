package com.officeutq.springtest.domain.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Test003FruitsTransactionExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public Test003FruitsTransactionExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andSequenceIdIsNull() {
			addCriterion("sequence_id is null");
			return (Criteria) this;
		}

		public Criteria andSequenceIdIsNotNull() {
			addCriterion("sequence_id is not null");
			return (Criteria) this;
		}

		public Criteria andSequenceIdEqualTo(Integer value) {
			addCriterion("sequence_id =", value, "sequenceId");
			return (Criteria) this;
		}

		public Criteria andSequenceIdNotEqualTo(Integer value) {
			addCriterion("sequence_id <>", value, "sequenceId");
			return (Criteria) this;
		}

		public Criteria andSequenceIdGreaterThan(Integer value) {
			addCriterion("sequence_id >", value, "sequenceId");
			return (Criteria) this;
		}

		public Criteria andSequenceIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("sequence_id >=", value, "sequenceId");
			return (Criteria) this;
		}

		public Criteria andSequenceIdLessThan(Integer value) {
			addCriterion("sequence_id <", value, "sequenceId");
			return (Criteria) this;
		}

		public Criteria andSequenceIdLessThanOrEqualTo(Integer value) {
			addCriterion("sequence_id <=", value, "sequenceId");
			return (Criteria) this;
		}

		public Criteria andSequenceIdIn(List<Integer> values) {
			addCriterion("sequence_id in", values, "sequenceId");
			return (Criteria) this;
		}

		public Criteria andSequenceIdNotIn(List<Integer> values) {
			addCriterion("sequence_id not in", values, "sequenceId");
			return (Criteria) this;
		}

		public Criteria andSequenceIdBetween(Integer value1, Integer value2) {
			addCriterion("sequence_id between", value1, value2, "sequenceId");
			return (Criteria) this;
		}

		public Criteria andSequenceIdNotBetween(Integer value1, Integer value2) {
			addCriterion("sequence_id not between", value1, value2, "sequenceId");
			return (Criteria) this;
		}

		public Criteria andFruitsIdIsNull() {
			addCriterion("fruits_id is null");
			return (Criteria) this;
		}

		public Criteria andFruitsIdIsNotNull() {
			addCriterion("fruits_id is not null");
			return (Criteria) this;
		}

		public Criteria andFruitsIdEqualTo(String value) {
			addCriterion("fruits_id =", value, "fruitsId");
			return (Criteria) this;
		}

		public Criteria andFruitsIdNotEqualTo(String value) {
			addCriterion("fruits_id <>", value, "fruitsId");
			return (Criteria) this;
		}

		public Criteria andFruitsIdGreaterThan(String value) {
			addCriterion("fruits_id >", value, "fruitsId");
			return (Criteria) this;
		}

		public Criteria andFruitsIdGreaterThanOrEqualTo(String value) {
			addCriterion("fruits_id >=", value, "fruitsId");
			return (Criteria) this;
		}

		public Criteria andFruitsIdLessThan(String value) {
			addCriterion("fruits_id <", value, "fruitsId");
			return (Criteria) this;
		}

		public Criteria andFruitsIdLessThanOrEqualTo(String value) {
			addCriterion("fruits_id <=", value, "fruitsId");
			return (Criteria) this;
		}

		public Criteria andFruitsIdLike(String value) {
			addCriterion("fruits_id like", value, "fruitsId");
			return (Criteria) this;
		}

		public Criteria andFruitsIdNotLike(String value) {
			addCriterion("fruits_id not like", value, "fruitsId");
			return (Criteria) this;
		}

		public Criteria andFruitsIdIn(List<String> values) {
			addCriterion("fruits_id in", values, "fruitsId");
			return (Criteria) this;
		}

		public Criteria andFruitsIdNotIn(List<String> values) {
			addCriterion("fruits_id not in", values, "fruitsId");
			return (Criteria) this;
		}

		public Criteria andFruitsIdBetween(String value1, String value2) {
			addCriterion("fruits_id between", value1, value2, "fruitsId");
			return (Criteria) this;
		}

		public Criteria andFruitsIdNotBetween(String value1, String value2) {
			addCriterion("fruits_id not between", value1, value2, "fruitsId");
			return (Criteria) this;
		}

		public Criteria andTransactionCountIsNull() {
			addCriterion("transaction_count is null");
			return (Criteria) this;
		}

		public Criteria andTransactionCountIsNotNull() {
			addCriterion("transaction_count is not null");
			return (Criteria) this;
		}

		public Criteria andTransactionCountEqualTo(Integer value) {
			addCriterion("transaction_count =", value, "transactionCount");
			return (Criteria) this;
		}

		public Criteria andTransactionCountNotEqualTo(Integer value) {
			addCriterion("transaction_count <>", value, "transactionCount");
			return (Criteria) this;
		}

		public Criteria andTransactionCountGreaterThan(Integer value) {
			addCriterion("transaction_count >", value, "transactionCount");
			return (Criteria) this;
		}

		public Criteria andTransactionCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("transaction_count >=", value, "transactionCount");
			return (Criteria) this;
		}

		public Criteria andTransactionCountLessThan(Integer value) {
			addCriterion("transaction_count <", value, "transactionCount");
			return (Criteria) this;
		}

		public Criteria andTransactionCountLessThanOrEqualTo(Integer value) {
			addCriterion("transaction_count <=", value, "transactionCount");
			return (Criteria) this;
		}

		public Criteria andTransactionCountIn(List<Integer> values) {
			addCriterion("transaction_count in", values, "transactionCount");
			return (Criteria) this;
		}

		public Criteria andTransactionCountNotIn(List<Integer> values) {
			addCriterion("transaction_count not in", values, "transactionCount");
			return (Criteria) this;
		}

		public Criteria andTransactionCountBetween(Integer value1, Integer value2) {
			addCriterion("transaction_count between", value1, value2, "transactionCount");
			return (Criteria) this;
		}

		public Criteria andTransactionCountNotBetween(Integer value1, Integer value2) {
			addCriterion("transaction_count not between", value1, value2, "transactionCount");
			return (Criteria) this;
		}

		public Criteria andTransactionDateIsNull() {
			addCriterion("transaction_date is null");
			return (Criteria) this;
		}

		public Criteria andTransactionDateIsNotNull() {
			addCriterion("transaction_date is not null");
			return (Criteria) this;
		}

		public Criteria andTransactionDateEqualTo(Date value) {
			addCriterionForJDBCDate("transaction_date =", value, "transactionDate");
			return (Criteria) this;
		}

		public Criteria andTransactionDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("transaction_date <>", value, "transactionDate");
			return (Criteria) this;
		}

		public Criteria andTransactionDateGreaterThan(Date value) {
			addCriterionForJDBCDate("transaction_date >", value, "transactionDate");
			return (Criteria) this;
		}

		public Criteria andTransactionDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("transaction_date >=", value, "transactionDate");
			return (Criteria) this;
		}

		public Criteria andTransactionDateLessThan(Date value) {
			addCriterionForJDBCDate("transaction_date <", value, "transactionDate");
			return (Criteria) this;
		}

		public Criteria andTransactionDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("transaction_date <=", value, "transactionDate");
			return (Criteria) this;
		}

		public Criteria andTransactionDateIn(List<Date> values) {
			addCriterionForJDBCDate("transaction_date in", values, "transactionDate");
			return (Criteria) this;
		}

		public Criteria andTransactionDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("transaction_date not in", values, "transactionDate");
			return (Criteria) this;
		}

		public Criteria andTransactionDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("transaction_date between", value1, value2, "transactionDate");
			return (Criteria) this;
		}

		public Criteria andTransactionDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("transaction_date not between", value1, value2, "transactionDate");
			return (Criteria) this;
		}

		public Criteria andPartnerIdIsNull() {
			addCriterion("partner_id is null");
			return (Criteria) this;
		}

		public Criteria andPartnerIdIsNotNull() {
			addCriterion("partner_id is not null");
			return (Criteria) this;
		}

		public Criteria andPartnerIdEqualTo(String value) {
			addCriterion("partner_id =", value, "partnerId");
			return (Criteria) this;
		}

		public Criteria andPartnerIdNotEqualTo(String value) {
			addCriterion("partner_id <>", value, "partnerId");
			return (Criteria) this;
		}

		public Criteria andPartnerIdGreaterThan(String value) {
			addCriterion("partner_id >", value, "partnerId");
			return (Criteria) this;
		}

		public Criteria andPartnerIdGreaterThanOrEqualTo(String value) {
			addCriterion("partner_id >=", value, "partnerId");
			return (Criteria) this;
		}

		public Criteria andPartnerIdLessThan(String value) {
			addCriterion("partner_id <", value, "partnerId");
			return (Criteria) this;
		}

		public Criteria andPartnerIdLessThanOrEqualTo(String value) {
			addCriterion("partner_id <=", value, "partnerId");
			return (Criteria) this;
		}

		public Criteria andPartnerIdLike(String value) {
			addCriterion("partner_id like", value, "partnerId");
			return (Criteria) this;
		}

		public Criteria andPartnerIdNotLike(String value) {
			addCriterion("partner_id not like", value, "partnerId");
			return (Criteria) this;
		}

		public Criteria andPartnerIdIn(List<String> values) {
			addCriterion("partner_id in", values, "partnerId");
			return (Criteria) this;
		}

		public Criteria andPartnerIdNotIn(List<String> values) {
			addCriterion("partner_id not in", values, "partnerId");
			return (Criteria) this;
		}

		public Criteria andPartnerIdBetween(String value1, String value2) {
			addCriterion("partner_id between", value1, value2, "partnerId");
			return (Criteria) this;
		}

		public Criteria andPartnerIdNotBetween(String value1, String value2) {
			addCriterion("partner_id not between", value1, value2, "partnerId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table test003_fruits_transaction
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test003_fruits_transaction
     *
     * @mbg.generated do_not_delete_during_merge Sun Apr 11 01:19:30 JST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}