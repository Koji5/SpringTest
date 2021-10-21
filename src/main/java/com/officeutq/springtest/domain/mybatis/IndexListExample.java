package com.officeutq.springtest.domain.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class IndexListExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public IndexListExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table index_list
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table index_list
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table index_list
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

		public Criteria andScreenIdIsNull() {
			addCriterion("screen_id is null");
			return (Criteria) this;
		}

		public Criteria andScreenIdIsNotNull() {
			addCriterion("screen_id is not null");
			return (Criteria) this;
		}

		public Criteria andScreenIdEqualTo(String value) {
			addCriterion("screen_id =", value, "screenId");
			return (Criteria) this;
		}

		public Criteria andScreenIdNotEqualTo(String value) {
			addCriterion("screen_id <>", value, "screenId");
			return (Criteria) this;
		}

		public Criteria andScreenIdGreaterThan(String value) {
			addCriterion("screen_id >", value, "screenId");
			return (Criteria) this;
		}

		public Criteria andScreenIdGreaterThanOrEqualTo(String value) {
			addCriterion("screen_id >=", value, "screenId");
			return (Criteria) this;
		}

		public Criteria andScreenIdLessThan(String value) {
			addCriterion("screen_id <", value, "screenId");
			return (Criteria) this;
		}

		public Criteria andScreenIdLessThanOrEqualTo(String value) {
			addCriterion("screen_id <=", value, "screenId");
			return (Criteria) this;
		}

		public Criteria andScreenIdLike(String value) {
			addCriterion("screen_id like", value, "screenId");
			return (Criteria) this;
		}

		public Criteria andScreenIdNotLike(String value) {
			addCriterion("screen_id not like", value, "screenId");
			return (Criteria) this;
		}

		public Criteria andScreenIdIn(List<String> values) {
			addCriterion("screen_id in", values, "screenId");
			return (Criteria) this;
		}

		public Criteria andScreenIdNotIn(List<String> values) {
			addCriterion("screen_id not in", values, "screenId");
			return (Criteria) this;
		}

		public Criteria andScreenIdBetween(String value1, String value2) {
			addCriterion("screen_id between", value1, value2, "screenId");
			return (Criteria) this;
		}

		public Criteria andScreenIdNotBetween(String value1, String value2) {
			addCriterion("screen_id not between", value1, value2, "screenId");
			return (Criteria) this;
		}

		public Criteria andIndexTitleIsNull() {
			addCriterion("index_title is null");
			return (Criteria) this;
		}

		public Criteria andIndexTitleIsNotNull() {
			addCriterion("index_title is not null");
			return (Criteria) this;
		}

		public Criteria andIndexTitleEqualTo(String value) {
			addCriterion("index_title =", value, "indexTitle");
			return (Criteria) this;
		}

		public Criteria andIndexTitleNotEqualTo(String value) {
			addCriterion("index_title <>", value, "indexTitle");
			return (Criteria) this;
		}

		public Criteria andIndexTitleGreaterThan(String value) {
			addCriterion("index_title >", value, "indexTitle");
			return (Criteria) this;
		}

		public Criteria andIndexTitleGreaterThanOrEqualTo(String value) {
			addCriterion("index_title >=", value, "indexTitle");
			return (Criteria) this;
		}

		public Criteria andIndexTitleLessThan(String value) {
			addCriterion("index_title <", value, "indexTitle");
			return (Criteria) this;
		}

		public Criteria andIndexTitleLessThanOrEqualTo(String value) {
			addCriterion("index_title <=", value, "indexTitle");
			return (Criteria) this;
		}

		public Criteria andIndexTitleLike(String value) {
			addCriterion("index_title like", value, "indexTitle");
			return (Criteria) this;
		}

		public Criteria andIndexTitleNotLike(String value) {
			addCriterion("index_title not like", value, "indexTitle");
			return (Criteria) this;
		}

		public Criteria andIndexTitleIn(List<String> values) {
			addCriterion("index_title in", values, "indexTitle");
			return (Criteria) this;
		}

		public Criteria andIndexTitleNotIn(List<String> values) {
			addCriterion("index_title not in", values, "indexTitle");
			return (Criteria) this;
		}

		public Criteria andIndexTitleBetween(String value1, String value2) {
			addCriterion("index_title between", value1, value2, "indexTitle");
			return (Criteria) this;
		}

		public Criteria andIndexTitleNotBetween(String value1, String value2) {
			addCriterion("index_title not between", value1, value2, "indexTitle");
			return (Criteria) this;
		}

		public Criteria andIndexExpIsNull() {
			addCriterion("index_exp is null");
			return (Criteria) this;
		}

		public Criteria andIndexExpIsNotNull() {
			addCriterion("index_exp is not null");
			return (Criteria) this;
		}

		public Criteria andIndexExpEqualTo(String value) {
			addCriterion("index_exp =", value, "indexExp");
			return (Criteria) this;
		}

		public Criteria andIndexExpNotEqualTo(String value) {
			addCriterion("index_exp <>", value, "indexExp");
			return (Criteria) this;
		}

		public Criteria andIndexExpGreaterThan(String value) {
			addCriterion("index_exp >", value, "indexExp");
			return (Criteria) this;
		}

		public Criteria andIndexExpGreaterThanOrEqualTo(String value) {
			addCriterion("index_exp >=", value, "indexExp");
			return (Criteria) this;
		}

		public Criteria andIndexExpLessThan(String value) {
			addCriterion("index_exp <", value, "indexExp");
			return (Criteria) this;
		}

		public Criteria andIndexExpLessThanOrEqualTo(String value) {
			addCriterion("index_exp <=", value, "indexExp");
			return (Criteria) this;
		}

		public Criteria andIndexExpLike(String value) {
			addCriterion("index_exp like", value, "indexExp");
			return (Criteria) this;
		}

		public Criteria andIndexExpNotLike(String value) {
			addCriterion("index_exp not like", value, "indexExp");
			return (Criteria) this;
		}

		public Criteria andIndexExpIn(List<String> values) {
			addCriterion("index_exp in", values, "indexExp");
			return (Criteria) this;
		}

		public Criteria andIndexExpNotIn(List<String> values) {
			addCriterion("index_exp not in", values, "indexExp");
			return (Criteria) this;
		}

		public Criteria andIndexExpBetween(String value1, String value2) {
			addCriterion("index_exp between", value1, value2, "indexExp");
			return (Criteria) this;
		}

		public Criteria andIndexExpNotBetween(String value1, String value2) {
			addCriterion("index_exp not between", value1, value2, "indexExp");
			return (Criteria) this;
		}

		public Criteria andIndexDateIsNull() {
			addCriterion("index_date is null");
			return (Criteria) this;
		}

		public Criteria andIndexDateIsNotNull() {
			addCriterion("index_date is not null");
			return (Criteria) this;
		}

		public Criteria andIndexDateEqualTo(Date value) {
			addCriterionForJDBCDate("index_date =", value, "indexDate");
			return (Criteria) this;
		}

		public Criteria andIndexDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("index_date <>", value, "indexDate");
			return (Criteria) this;
		}

		public Criteria andIndexDateGreaterThan(Date value) {
			addCriterionForJDBCDate("index_date >", value, "indexDate");
			return (Criteria) this;
		}

		public Criteria andIndexDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("index_date >=", value, "indexDate");
			return (Criteria) this;
		}

		public Criteria andIndexDateLessThan(Date value) {
			addCriterionForJDBCDate("index_date <", value, "indexDate");
			return (Criteria) this;
		}

		public Criteria andIndexDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("index_date <=", value, "indexDate");
			return (Criteria) this;
		}

		public Criteria andIndexDateIn(List<Date> values) {
			addCriterionForJDBCDate("index_date in", values, "indexDate");
			return (Criteria) this;
		}

		public Criteria andIndexDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("index_date not in", values, "indexDate");
			return (Criteria) this;
		}

		public Criteria andIndexDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("index_date between", value1, value2, "indexDate");
			return (Criteria) this;
		}

		public Criteria andIndexDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("index_date not between", value1, value2, "indexDate");
			return (Criteria) this;
		}

		public Criteria andIndexMemoIsNull() {
			addCriterion("index_memo is null");
			return (Criteria) this;
		}

		public Criteria andIndexMemoIsNotNull() {
			addCriterion("index_memo is not null");
			return (Criteria) this;
		}

		public Criteria andIndexMemoEqualTo(String value) {
			addCriterion("index_memo =", value, "indexMemo");
			return (Criteria) this;
		}

		public Criteria andIndexMemoNotEqualTo(String value) {
			addCriterion("index_memo <>", value, "indexMemo");
			return (Criteria) this;
		}

		public Criteria andIndexMemoGreaterThan(String value) {
			addCriterion("index_memo >", value, "indexMemo");
			return (Criteria) this;
		}

		public Criteria andIndexMemoGreaterThanOrEqualTo(String value) {
			addCriterion("index_memo >=", value, "indexMemo");
			return (Criteria) this;
		}

		public Criteria andIndexMemoLessThan(String value) {
			addCriterion("index_memo <", value, "indexMemo");
			return (Criteria) this;
		}

		public Criteria andIndexMemoLessThanOrEqualTo(String value) {
			addCriterion("index_memo <=", value, "indexMemo");
			return (Criteria) this;
		}

		public Criteria andIndexMemoLike(String value) {
			addCriterion("index_memo like", value, "indexMemo");
			return (Criteria) this;
		}

		public Criteria andIndexMemoNotLike(String value) {
			addCriterion("index_memo not like", value, "indexMemo");
			return (Criteria) this;
		}

		public Criteria andIndexMemoIn(List<String> values) {
			addCriterion("index_memo in", values, "indexMemo");
			return (Criteria) this;
		}

		public Criteria andIndexMemoNotIn(List<String> values) {
			addCriterion("index_memo not in", values, "indexMemo");
			return (Criteria) this;
		}

		public Criteria andIndexMemoBetween(String value1, String value2) {
			addCriterion("index_memo between", value1, value2, "indexMemo");
			return (Criteria) this;
		}

		public Criteria andIndexMemoNotBetween(String value1, String value2) {
			addCriterion("index_memo not between", value1, value2, "indexMemo");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table index_list
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
     * This class corresponds to the database table index_list
     *
     * @mbg.generated do_not_delete_during_merge Sun Apr 11 01:19:30 JST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}