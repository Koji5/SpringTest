package com.officeutq.springtest.domain.mybatis;

import java.util.ArrayList;
import java.util.List;

public class Test003FruitsPartnerExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public Test003FruitsPartnerExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_partner
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test003_fruits_partner
	 * @mbg.generated  Fri Apr 16 22:12:27 JST 2021
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table test003_fruits_partner
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

		public Criteria andPartnerNameIsNull() {
			addCriterion("partner_name is null");
			return (Criteria) this;
		}

		public Criteria andPartnerNameIsNotNull() {
			addCriterion("partner_name is not null");
			return (Criteria) this;
		}

		public Criteria andPartnerNameEqualTo(String value) {
			addCriterion("partner_name =", value, "partnerName");
			return (Criteria) this;
		}

		public Criteria andPartnerNameNotEqualTo(String value) {
			addCriterion("partner_name <>", value, "partnerName");
			return (Criteria) this;
		}

		public Criteria andPartnerNameGreaterThan(String value) {
			addCriterion("partner_name >", value, "partnerName");
			return (Criteria) this;
		}

		public Criteria andPartnerNameGreaterThanOrEqualTo(String value) {
			addCriterion("partner_name >=", value, "partnerName");
			return (Criteria) this;
		}

		public Criteria andPartnerNameLessThan(String value) {
			addCriterion("partner_name <", value, "partnerName");
			return (Criteria) this;
		}

		public Criteria andPartnerNameLessThanOrEqualTo(String value) {
			addCriterion("partner_name <=", value, "partnerName");
			return (Criteria) this;
		}

		public Criteria andPartnerNameLike(String value) {
			addCriterion("partner_name like", value, "partnerName");
			return (Criteria) this;
		}

		public Criteria andPartnerNameNotLike(String value) {
			addCriterion("partner_name not like", value, "partnerName");
			return (Criteria) this;
		}

		public Criteria andPartnerNameIn(List<String> values) {
			addCriterion("partner_name in", values, "partnerName");
			return (Criteria) this;
		}

		public Criteria andPartnerNameNotIn(List<String> values) {
			addCriterion("partner_name not in", values, "partnerName");
			return (Criteria) this;
		}

		public Criteria andPartnerNameBetween(String value1, String value2) {
			addCriterion("partner_name between", value1, value2, "partnerName");
			return (Criteria) this;
		}

		public Criteria andPartnerNameNotBetween(String value1, String value2) {
			addCriterion("partner_name not between", value1, value2, "partnerName");
			return (Criteria) this;
		}

		public Criteria andPartnerProductsIsNull() {
			addCriterion("partner_products is null");
			return (Criteria) this;
		}

		public Criteria andPartnerProductsIsNotNull() {
			addCriterion("partner_products is not null");
			return (Criteria) this;
		}

		public Criteria andPartnerProductsEqualTo(Object value) {
			addCriterion("partner_products =", value, "partnerProducts");
			return (Criteria) this;
		}

		public Criteria andPartnerProductsNotEqualTo(Object value) {
			addCriterion("partner_products <>", value, "partnerProducts");
			return (Criteria) this;
		}

		public Criteria andPartnerProductsGreaterThan(Object value) {
			addCriterion("partner_products >", value, "partnerProducts");
			return (Criteria) this;
		}

		public Criteria andPartnerProductsGreaterThanOrEqualTo(Object value) {
			addCriterion("partner_products >=", value, "partnerProducts");
			return (Criteria) this;
		}

		public Criteria andPartnerProductsLessThan(Object value) {
			addCriterion("partner_products <", value, "partnerProducts");
			return (Criteria) this;
		}

		public Criteria andPartnerProductsLessThanOrEqualTo(Object value) {
			addCriterion("partner_products <=", value, "partnerProducts");
			return (Criteria) this;
		}

		public Criteria andPartnerProductsIn(List<Object> values) {
			addCriterion("partner_products in", values, "partnerProducts");
			return (Criteria) this;
		}

		public Criteria andPartnerProductsNotIn(List<Object> values) {
			addCriterion("partner_products not in", values, "partnerProducts");
			return (Criteria) this;
		}

		public Criteria andPartnerProductsBetween(Object value1, Object value2) {
			addCriterion("partner_products between", value1, value2, "partnerProducts");
			return (Criteria) this;
		}

		public Criteria andPartnerProductsNotBetween(Object value1, Object value2) {
			addCriterion("partner_products not between", value1, value2, "partnerProducts");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table test003_fruits_partner
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
     * This class corresponds to the database table test003_fruits_partner
     *
     * @mbg.generated do_not_delete_during_merge Sun Apr 11 01:19:30 JST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}