package com.ly.springboot.module;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ModelTreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelTreeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
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

        public Criteria andSysModelIdIsNull() {
            addCriterion("SYS_MODEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysModelIdIsNotNull() {
            addCriterion("SYS_MODEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysModelIdEqualTo(BigDecimal value) {
            addCriterion("SYS_MODEL_ID =", value, "sysModelId");
            return (Criteria) this;
        }

        public Criteria andSysModelIdNotEqualTo(BigDecimal value) {
            addCriterion("SYS_MODEL_ID <>", value, "sysModelId");
            return (Criteria) this;
        }

        public Criteria andSysModelIdGreaterThan(BigDecimal value) {
            addCriterion("SYS_MODEL_ID >", value, "sysModelId");
            return (Criteria) this;
        }

        public Criteria andSysModelIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYS_MODEL_ID >=", value, "sysModelId");
            return (Criteria) this;
        }

        public Criteria andSysModelIdLessThan(BigDecimal value) {
            addCriterion("SYS_MODEL_ID <", value, "sysModelId");
            return (Criteria) this;
        }

        public Criteria andSysModelIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYS_MODEL_ID <=", value, "sysModelId");
            return (Criteria) this;
        }

        public Criteria andSysModelIdIn(List<BigDecimal> values) {
            addCriterion("SYS_MODEL_ID in", values, "sysModelId");
            return (Criteria) this;
        }

        public Criteria andSysModelIdNotIn(List<BigDecimal> values) {
            addCriterion("SYS_MODEL_ID not in", values, "sysModelId");
            return (Criteria) this;
        }

        public Criteria andSysModelIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYS_MODEL_ID between", value1, value2, "sysModelId");
            return (Criteria) this;
        }

        public Criteria andSysModelIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYS_MODEL_ID not between", value1, value2, "sysModelId");
            return (Criteria) this;
        }

        public Criteria andParSysModelIdIsNull() {
            addCriterion("PAR_SYS_MODEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andParSysModelIdIsNotNull() {
            addCriterion("PAR_SYS_MODEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParSysModelIdEqualTo(BigDecimal value) {
            addCriterion("PAR_SYS_MODEL_ID =", value, "parSysModelId");
            return (Criteria) this;
        }

        public Criteria andParSysModelIdNotEqualTo(BigDecimal value) {
            addCriterion("PAR_SYS_MODEL_ID <>", value, "parSysModelId");
            return (Criteria) this;
        }

        public Criteria andParSysModelIdGreaterThan(BigDecimal value) {
            addCriterion("PAR_SYS_MODEL_ID >", value, "parSysModelId");
            return (Criteria) this;
        }

        public Criteria andParSysModelIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAR_SYS_MODEL_ID >=", value, "parSysModelId");
            return (Criteria) this;
        }

        public Criteria andParSysModelIdLessThan(BigDecimal value) {
            addCriterion("PAR_SYS_MODEL_ID <", value, "parSysModelId");
            return (Criteria) this;
        }

        public Criteria andParSysModelIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAR_SYS_MODEL_ID <=", value, "parSysModelId");
            return (Criteria) this;
        }

        public Criteria andParSysModelIdIn(List<BigDecimal> values) {
            addCriterion("PAR_SYS_MODEL_ID in", values, "parSysModelId");
            return (Criteria) this;
        }

        public Criteria andParSysModelIdNotIn(List<BigDecimal> values) {
            addCriterion("PAR_SYS_MODEL_ID not in", values, "parSysModelId");
            return (Criteria) this;
        }

        public Criteria andParSysModelIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAR_SYS_MODEL_ID between", value1, value2, "parSysModelId");
            return (Criteria) this;
        }

        public Criteria andParSysModelIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAR_SYS_MODEL_ID not between", value1, value2, "parSysModelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("MODEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("MODEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(String value) {
            addCriterion("MODEL_ID =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(String value) {
            addCriterion("MODEL_ID <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(String value) {
            addCriterion("MODEL_ID >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_ID >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(String value) {
            addCriterion("MODEL_ID <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(String value) {
            addCriterion("MODEL_ID <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLike(String value) {
            addCriterion("MODEL_ID like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotLike(String value) {
            addCriterion("MODEL_ID not like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<String> values) {
            addCriterion("MODEL_ID in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<String> values) {
            addCriterion("MODEL_ID not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(String value1, String value2) {
            addCriterion("MODEL_ID between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(String value1, String value2) {
            addCriterion("MODEL_ID not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeIsNull() {
            addCriterion("EXIST_MODEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeIsNotNull() {
            addCriterion("EXIST_MODEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeEqualTo(String value) {
            addCriterion("EXIST_MODEL_CODE =", value, "existModelCode");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeNotEqualTo(String value) {
            addCriterion("EXIST_MODEL_CODE <>", value, "existModelCode");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeGreaterThan(String value) {
            addCriterion("EXIST_MODEL_CODE >", value, "existModelCode");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXIST_MODEL_CODE >=", value, "existModelCode");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeLessThan(String value) {
            addCriterion("EXIST_MODEL_CODE <", value, "existModelCode");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeLessThanOrEqualTo(String value) {
            addCriterion("EXIST_MODEL_CODE <=", value, "existModelCode");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeLike(String value) {
            addCriterion("EXIST_MODEL_CODE like", value, "existModelCode");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeNotLike(String value) {
            addCriterion("EXIST_MODEL_CODE not like", value, "existModelCode");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeIn(List<String> values) {
            addCriterion("EXIST_MODEL_CODE in", values, "existModelCode");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeNotIn(List<String> values) {
            addCriterion("EXIST_MODEL_CODE not in", values, "existModelCode");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeBetween(String value1, String value2) {
            addCriterion("EXIST_MODEL_CODE between", value1, value2, "existModelCode");
            return (Criteria) this;
        }

        public Criteria andExistModelCodeNotBetween(String value1, String value2) {
            addCriterion("EXIST_MODEL_CODE not between", value1, value2, "existModelCode");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNull() {
            addCriterion("MODEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("MODEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("MODEL_NAME =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("MODEL_NAME <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("MODEL_NAME >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_NAME >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("MODEL_NAME <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("MODEL_NAME <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("MODEL_NAME like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("MODEL_NAME not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("MODEL_NAME in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("MODEL_NAME not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("MODEL_NAME between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("MODEL_NAME not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelLvlIsNull() {
            addCriterion("MODEL_LVL is null");
            return (Criteria) this;
        }

        public Criteria andModelLvlIsNotNull() {
            addCriterion("MODEL_LVL is not null");
            return (Criteria) this;
        }

        public Criteria andModelLvlEqualTo(BigDecimal value) {
            addCriterion("MODEL_LVL =", value, "modelLvl");
            return (Criteria) this;
        }

        public Criteria andModelLvlNotEqualTo(BigDecimal value) {
            addCriterion("MODEL_LVL <>", value, "modelLvl");
            return (Criteria) this;
        }

        public Criteria andModelLvlGreaterThan(BigDecimal value) {
            addCriterion("MODEL_LVL >", value, "modelLvl");
            return (Criteria) this;
        }

        public Criteria andModelLvlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MODEL_LVL >=", value, "modelLvl");
            return (Criteria) this;
        }

        public Criteria andModelLvlLessThan(BigDecimal value) {
            addCriterion("MODEL_LVL <", value, "modelLvl");
            return (Criteria) this;
        }

        public Criteria andModelLvlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MODEL_LVL <=", value, "modelLvl");
            return (Criteria) this;
        }

        public Criteria andModelLvlIn(List<BigDecimal> values) {
            addCriterion("MODEL_LVL in", values, "modelLvl");
            return (Criteria) this;
        }

        public Criteria andModelLvlNotIn(List<BigDecimal> values) {
            addCriterion("MODEL_LVL not in", values, "modelLvl");
            return (Criteria) this;
        }

        public Criteria andModelLvlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODEL_LVL between", value1, value2, "modelLvl");
            return (Criteria) this;
        }

        public Criteria andModelLvlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODEL_LVL not between", value1, value2, "modelLvl");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeIsNull() {
            addCriterion("SYS_MODEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeIsNotNull() {
            addCriterion("SYS_MODEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeEqualTo(String value) {
            addCriterion("SYS_MODEL_TYPE =", value, "sysModelType");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeNotEqualTo(String value) {
            addCriterion("SYS_MODEL_TYPE <>", value, "sysModelType");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeGreaterThan(String value) {
            addCriterion("SYS_MODEL_TYPE >", value, "sysModelType");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_MODEL_TYPE >=", value, "sysModelType");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeLessThan(String value) {
            addCriterion("SYS_MODEL_TYPE <", value, "sysModelType");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeLessThanOrEqualTo(String value) {
            addCriterion("SYS_MODEL_TYPE <=", value, "sysModelType");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeLike(String value) {
            addCriterion("SYS_MODEL_TYPE like", value, "sysModelType");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeNotLike(String value) {
            addCriterion("SYS_MODEL_TYPE not like", value, "sysModelType");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeIn(List<String> values) {
            addCriterion("SYS_MODEL_TYPE in", values, "sysModelType");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeNotIn(List<String> values) {
            addCriterion("SYS_MODEL_TYPE not in", values, "sysModelType");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeBetween(String value1, String value2) {
            addCriterion("SYS_MODEL_TYPE between", value1, value2, "sysModelType");
            return (Criteria) this;
        }

        public Criteria andSysModelTypeNotBetween(String value1, String value2) {
            addCriterion("SYS_MODEL_TYPE not between", value1, value2, "sysModelType");
            return (Criteria) this;
        }

        public Criteria andRootSystemIdIsNull() {
            addCriterion("ROOT_SYSTEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRootSystemIdIsNotNull() {
            addCriterion("ROOT_SYSTEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRootSystemIdEqualTo(BigDecimal value) {
            addCriterion("ROOT_SYSTEM_ID =", value, "rootSystemId");
            return (Criteria) this;
        }

        public Criteria andRootSystemIdNotEqualTo(BigDecimal value) {
            addCriterion("ROOT_SYSTEM_ID <>", value, "rootSystemId");
            return (Criteria) this;
        }

        public Criteria andRootSystemIdGreaterThan(BigDecimal value) {
            addCriterion("ROOT_SYSTEM_ID >", value, "rootSystemId");
            return (Criteria) this;
        }

        public Criteria andRootSystemIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOT_SYSTEM_ID >=", value, "rootSystemId");
            return (Criteria) this;
        }

        public Criteria andRootSystemIdLessThan(BigDecimal value) {
            addCriterion("ROOT_SYSTEM_ID <", value, "rootSystemId");
            return (Criteria) this;
        }

        public Criteria andRootSystemIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOT_SYSTEM_ID <=", value, "rootSystemId");
            return (Criteria) this;
        }

        public Criteria andRootSystemIdIn(List<BigDecimal> values) {
            addCriterion("ROOT_SYSTEM_ID in", values, "rootSystemId");
            return (Criteria) this;
        }

        public Criteria andRootSystemIdNotIn(List<BigDecimal> values) {
            addCriterion("ROOT_SYSTEM_ID not in", values, "rootSystemId");
            return (Criteria) this;
        }

        public Criteria andRootSystemIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOT_SYSTEM_ID between", value1, value2, "rootSystemId");
            return (Criteria) this;
        }

        public Criteria andRootSystemIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOT_SYSTEM_ID not between", value1, value2, "rootSystemId");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNull() {
            addCriterion("ACCESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNotNull() {
            addCriterion("ACCESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeEqualTo(String value) {
            addCriterion("ACCESS_TYPE =", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotEqualTo(String value) {
            addCriterion("ACCESS_TYPE <>", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThan(String value) {
            addCriterion("ACCESS_TYPE >", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_TYPE >=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThan(String value) {
            addCriterion("ACCESS_TYPE <", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_TYPE <=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLike(String value) {
            addCriterion("ACCESS_TYPE like", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotLike(String value) {
            addCriterion("ACCESS_TYPE not like", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIn(List<String> values) {
            addCriterion("ACCESS_TYPE in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotIn(List<String> values) {
            addCriterion("ACCESS_TYPE not in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeBetween(String value1, String value2) {
            addCriterion("ACCESS_TYPE between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotBetween(String value1, String value2) {
            addCriterion("ACCESS_TYPE not between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andAccessPathIsNull() {
            addCriterion("ACCESS_PATH is null");
            return (Criteria) this;
        }

        public Criteria andAccessPathIsNotNull() {
            addCriterion("ACCESS_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andAccessPathEqualTo(String value) {
            addCriterion("ACCESS_PATH =", value, "accessPath");
            return (Criteria) this;
        }

        public Criteria andAccessPathNotEqualTo(String value) {
            addCriterion("ACCESS_PATH <>", value, "accessPath");
            return (Criteria) this;
        }

        public Criteria andAccessPathGreaterThan(String value) {
            addCriterion("ACCESS_PATH >", value, "accessPath");
            return (Criteria) this;
        }

        public Criteria andAccessPathGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_PATH >=", value, "accessPath");
            return (Criteria) this;
        }

        public Criteria andAccessPathLessThan(String value) {
            addCriterion("ACCESS_PATH <", value, "accessPath");
            return (Criteria) this;
        }

        public Criteria andAccessPathLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_PATH <=", value, "accessPath");
            return (Criteria) this;
        }

        public Criteria andAccessPathLike(String value) {
            addCriterion("ACCESS_PATH like", value, "accessPath");
            return (Criteria) this;
        }

        public Criteria andAccessPathNotLike(String value) {
            addCriterion("ACCESS_PATH not like", value, "accessPath");
            return (Criteria) this;
        }

        public Criteria andAccessPathIn(List<String> values) {
            addCriterion("ACCESS_PATH in", values, "accessPath");
            return (Criteria) this;
        }

        public Criteria andAccessPathNotIn(List<String> values) {
            addCriterion("ACCESS_PATH not in", values, "accessPath");
            return (Criteria) this;
        }

        public Criteria andAccessPathBetween(String value1, String value2) {
            addCriterion("ACCESS_PATH between", value1, value2, "accessPath");
            return (Criteria) this;
        }

        public Criteria andAccessPathNotBetween(String value1, String value2) {
            addCriterion("ACCESS_PATH not between", value1, value2, "accessPath");
            return (Criteria) this;
        }

        public Criteria andIsLogIsNull() {
            addCriterion("IS_LOG is null");
            return (Criteria) this;
        }

        public Criteria andIsLogIsNotNull() {
            addCriterion("IS_LOG is not null");
            return (Criteria) this;
        }

        public Criteria andIsLogEqualTo(String value) {
            addCriterion("IS_LOG =", value, "isLog");
            return (Criteria) this;
        }

        public Criteria andIsLogNotEqualTo(String value) {
            addCriterion("IS_LOG <>", value, "isLog");
            return (Criteria) this;
        }

        public Criteria andIsLogGreaterThan(String value) {
            addCriterion("IS_LOG >", value, "isLog");
            return (Criteria) this;
        }

        public Criteria andIsLogGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LOG >=", value, "isLog");
            return (Criteria) this;
        }

        public Criteria andIsLogLessThan(String value) {
            addCriterion("IS_LOG <", value, "isLog");
            return (Criteria) this;
        }

        public Criteria andIsLogLessThanOrEqualTo(String value) {
            addCriterion("IS_LOG <=", value, "isLog");
            return (Criteria) this;
        }

        public Criteria andIsLogLike(String value) {
            addCriterion("IS_LOG like", value, "isLog");
            return (Criteria) this;
        }

        public Criteria andIsLogNotLike(String value) {
            addCriterion("IS_LOG not like", value, "isLog");
            return (Criteria) this;
        }

        public Criteria andIsLogIn(List<String> values) {
            addCriterion("IS_LOG in", values, "isLog");
            return (Criteria) this;
        }

        public Criteria andIsLogNotIn(List<String> values) {
            addCriterion("IS_LOG not in", values, "isLog");
            return (Criteria) this;
        }

        public Criteria andIsLogBetween(String value1, String value2) {
            addCriterion("IS_LOG between", value1, value2, "isLog");
            return (Criteria) this;
        }

        public Criteria andIsLogNotBetween(String value1, String value2) {
            addCriterion("IS_LOG not between", value1, value2, "isLog");
            return (Criteria) this;
        }

        public Criteria andDevPeopleIsNull() {
            addCriterion("DEV_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andDevPeopleIsNotNull() {
            addCriterion("DEV_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andDevPeopleEqualTo(String value) {
            addCriterion("DEV_PEOPLE =", value, "devPeople");
            return (Criteria) this;
        }

        public Criteria andDevPeopleNotEqualTo(String value) {
            addCriterion("DEV_PEOPLE <>", value, "devPeople");
            return (Criteria) this;
        }

        public Criteria andDevPeopleGreaterThan(String value) {
            addCriterion("DEV_PEOPLE >", value, "devPeople");
            return (Criteria) this;
        }

        public Criteria andDevPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("DEV_PEOPLE >=", value, "devPeople");
            return (Criteria) this;
        }

        public Criteria andDevPeopleLessThan(String value) {
            addCriterion("DEV_PEOPLE <", value, "devPeople");
            return (Criteria) this;
        }

        public Criteria andDevPeopleLessThanOrEqualTo(String value) {
            addCriterion("DEV_PEOPLE <=", value, "devPeople");
            return (Criteria) this;
        }

        public Criteria andDevPeopleLike(String value) {
            addCriterion("DEV_PEOPLE like", value, "devPeople");
            return (Criteria) this;
        }

        public Criteria andDevPeopleNotLike(String value) {
            addCriterion("DEV_PEOPLE not like", value, "devPeople");
            return (Criteria) this;
        }

        public Criteria andDevPeopleIn(List<String> values) {
            addCriterion("DEV_PEOPLE in", values, "devPeople");
            return (Criteria) this;
        }

        public Criteria andDevPeopleNotIn(List<String> values) {
            addCriterion("DEV_PEOPLE not in", values, "devPeople");
            return (Criteria) this;
        }

        public Criteria andDevPeopleBetween(String value1, String value2) {
            addCriterion("DEV_PEOPLE between", value1, value2, "devPeople");
            return (Criteria) this;
        }

        public Criteria andDevPeopleNotBetween(String value1, String value2) {
            addCriterion("DEV_PEOPLE not between", value1, value2, "devPeople");
            return (Criteria) this;
        }

        public Criteria andModelStateIsNull() {
            addCriterion("MODEL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andModelStateIsNotNull() {
            addCriterion("MODEL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andModelStateEqualTo(BigDecimal value) {
            addCriterion("MODEL_STATE =", value, "modelState");
            return (Criteria) this;
        }

        public Criteria andModelStateNotEqualTo(BigDecimal value) {
            addCriterion("MODEL_STATE <>", value, "modelState");
            return (Criteria) this;
        }

        public Criteria andModelStateGreaterThan(BigDecimal value) {
            addCriterion("MODEL_STATE >", value, "modelState");
            return (Criteria) this;
        }

        public Criteria andModelStateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MODEL_STATE >=", value, "modelState");
            return (Criteria) this;
        }

        public Criteria andModelStateLessThan(BigDecimal value) {
            addCriterion("MODEL_STATE <", value, "modelState");
            return (Criteria) this;
        }

        public Criteria andModelStateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MODEL_STATE <=", value, "modelState");
            return (Criteria) this;
        }

        public Criteria andModelStateIn(List<BigDecimal> values) {
            addCriterion("MODEL_STATE in", values, "modelState");
            return (Criteria) this;
        }

        public Criteria andModelStateNotIn(List<BigDecimal> values) {
            addCriterion("MODEL_STATE not in", values, "modelState");
            return (Criteria) this;
        }

        public Criteria andModelStateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODEL_STATE between", value1, value2, "modelState");
            return (Criteria) this;
        }

        public Criteria andModelStateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODEL_STATE not between", value1, value2, "modelState");
            return (Criteria) this;
        }

        public Criteria andStartDtIsNull() {
            addCriterion("START_DT is null");
            return (Criteria) this;
        }

        public Criteria andStartDtIsNotNull() {
            addCriterion("START_DT is not null");
            return (Criteria) this;
        }

        public Criteria andStartDtEqualTo(Date value) {
            addCriterionForJDBCDate("START_DT =", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_DT <>", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtGreaterThan(Date value) {
            addCriterionForJDBCDate("START_DT >", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DT >=", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtLessThan(Date value) {
            addCriterionForJDBCDate("START_DT <", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DT <=", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtIn(List<Date> values) {
            addCriterionForJDBCDate("START_DT in", values, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_DT not in", values, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DT between", value1, value2, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DT not between", value1, value2, "startDt");
            return (Criteria) this;
        }

        public Criteria andEndDtIsNull() {
            addCriterion("END_DT is null");
            return (Criteria) this;
        }

        public Criteria andEndDtIsNotNull() {
            addCriterion("END_DT is not null");
            return (Criteria) this;
        }

        public Criteria andEndDtEqualTo(Date value) {
            addCriterionForJDBCDate("END_DT =", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_DT <>", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtGreaterThan(Date value) {
            addCriterionForJDBCDate("END_DT >", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DT >=", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtLessThan(Date value) {
            addCriterionForJDBCDate("END_DT <", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DT <=", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtIn(List<Date> values) {
            addCriterionForJDBCDate("END_DT in", values, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_DT not in", values, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DT between", value1, value2, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DT not between", value1, value2, "endDt");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("LAST_UPDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("LAST_UPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_UPDATE =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_UPDATE <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("LAST_UPDATE >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_UPDATE >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterionForJDBCDate("LAST_UPDATE <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_UPDATE <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_UPDATE in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_UPDATE not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_UPDATE between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_UPDATE not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andIsControlIsNull() {
            addCriterion("IS_CONTROL is null");
            return (Criteria) this;
        }

        public Criteria andIsControlIsNotNull() {
            addCriterion("IS_CONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andIsControlEqualTo(String value) {
            addCriterion("IS_CONTROL =", value, "isControl");
            return (Criteria) this;
        }

        public Criteria andIsControlNotEqualTo(String value) {
            addCriterion("IS_CONTROL <>", value, "isControl");
            return (Criteria) this;
        }

        public Criteria andIsControlGreaterThan(String value) {
            addCriterion("IS_CONTROL >", value, "isControl");
            return (Criteria) this;
        }

        public Criteria andIsControlGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CONTROL >=", value, "isControl");
            return (Criteria) this;
        }

        public Criteria andIsControlLessThan(String value) {
            addCriterion("IS_CONTROL <", value, "isControl");
            return (Criteria) this;
        }

        public Criteria andIsControlLessThanOrEqualTo(String value) {
            addCriterion("IS_CONTROL <=", value, "isControl");
            return (Criteria) this;
        }

        public Criteria andIsControlLike(String value) {
            addCriterion("IS_CONTROL like", value, "isControl");
            return (Criteria) this;
        }

        public Criteria andIsControlNotLike(String value) {
            addCriterion("IS_CONTROL not like", value, "isControl");
            return (Criteria) this;
        }

        public Criteria andIsControlIn(List<String> values) {
            addCriterion("IS_CONTROL in", values, "isControl");
            return (Criteria) this;
        }

        public Criteria andIsControlNotIn(List<String> values) {
            addCriterion("IS_CONTROL not in", values, "isControl");
            return (Criteria) this;
        }

        public Criteria andIsControlBetween(String value1, String value2) {
            addCriterion("IS_CONTROL between", value1, value2, "isControl");
            return (Criteria) this;
        }

        public Criteria andIsControlNotBetween(String value1, String value2) {
            addCriterion("IS_CONTROL not between", value1, value2, "isControl");
            return (Criteria) this;
        }

        public Criteria andIosIconIsNull() {
            addCriterion("IOS_ICON is null");
            return (Criteria) this;
        }

        public Criteria andIosIconIsNotNull() {
            addCriterion("IOS_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIosIconEqualTo(String value) {
            addCriterion("IOS_ICON =", value, "iosIcon");
            return (Criteria) this;
        }

        public Criteria andIosIconNotEqualTo(String value) {
            addCriterion("IOS_ICON <>", value, "iosIcon");
            return (Criteria) this;
        }

        public Criteria andIosIconGreaterThan(String value) {
            addCriterion("IOS_ICON >", value, "iosIcon");
            return (Criteria) this;
        }

        public Criteria andIosIconGreaterThanOrEqualTo(String value) {
            addCriterion("IOS_ICON >=", value, "iosIcon");
            return (Criteria) this;
        }

        public Criteria andIosIconLessThan(String value) {
            addCriterion("IOS_ICON <", value, "iosIcon");
            return (Criteria) this;
        }

        public Criteria andIosIconLessThanOrEqualTo(String value) {
            addCriterion("IOS_ICON <=", value, "iosIcon");
            return (Criteria) this;
        }

        public Criteria andIosIconLike(String value) {
            addCriterion("IOS_ICON like", value, "iosIcon");
            return (Criteria) this;
        }

        public Criteria andIosIconNotLike(String value) {
            addCriterion("IOS_ICON not like", value, "iosIcon");
            return (Criteria) this;
        }

        public Criteria andIosIconIn(List<String> values) {
            addCriterion("IOS_ICON in", values, "iosIcon");
            return (Criteria) this;
        }

        public Criteria andIosIconNotIn(List<String> values) {
            addCriterion("IOS_ICON not in", values, "iosIcon");
            return (Criteria) this;
        }

        public Criteria andIosIconBetween(String value1, String value2) {
            addCriterion("IOS_ICON between", value1, value2, "iosIcon");
            return (Criteria) this;
        }

        public Criteria andIosIconNotBetween(String value1, String value2) {
            addCriterion("IOS_ICON not between", value1, value2, "iosIcon");
            return (Criteria) this;
        }

        public Criteria andIosPkgIsNull() {
            addCriterion("IOS_PKG is null");
            return (Criteria) this;
        }

        public Criteria andIosPkgIsNotNull() {
            addCriterion("IOS_PKG is not null");
            return (Criteria) this;
        }

        public Criteria andIosPkgEqualTo(String value) {
            addCriterion("IOS_PKG =", value, "iosPkg");
            return (Criteria) this;
        }

        public Criteria andIosPkgNotEqualTo(String value) {
            addCriterion("IOS_PKG <>", value, "iosPkg");
            return (Criteria) this;
        }

        public Criteria andIosPkgGreaterThan(String value) {
            addCriterion("IOS_PKG >", value, "iosPkg");
            return (Criteria) this;
        }

        public Criteria andIosPkgGreaterThanOrEqualTo(String value) {
            addCriterion("IOS_PKG >=", value, "iosPkg");
            return (Criteria) this;
        }

        public Criteria andIosPkgLessThan(String value) {
            addCriterion("IOS_PKG <", value, "iosPkg");
            return (Criteria) this;
        }

        public Criteria andIosPkgLessThanOrEqualTo(String value) {
            addCriterion("IOS_PKG <=", value, "iosPkg");
            return (Criteria) this;
        }

        public Criteria andIosPkgLike(String value) {
            addCriterion("IOS_PKG like", value, "iosPkg");
            return (Criteria) this;
        }

        public Criteria andIosPkgNotLike(String value) {
            addCriterion("IOS_PKG not like", value, "iosPkg");
            return (Criteria) this;
        }

        public Criteria andIosPkgIn(List<String> values) {
            addCriterion("IOS_PKG in", values, "iosPkg");
            return (Criteria) this;
        }

        public Criteria andIosPkgNotIn(List<String> values) {
            addCriterion("IOS_PKG not in", values, "iosPkg");
            return (Criteria) this;
        }

        public Criteria andIosPkgBetween(String value1, String value2) {
            addCriterion("IOS_PKG between", value1, value2, "iosPkg");
            return (Criteria) this;
        }

        public Criteria andIosPkgNotBetween(String value1, String value2) {
            addCriterion("IOS_PKG not between", value1, value2, "iosPkg");
            return (Criteria) this;
        }

        public Criteria andIosClassIsNull() {
            addCriterion("IOS_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andIosClassIsNotNull() {
            addCriterion("IOS_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andIosClassEqualTo(String value) {
            addCriterion("IOS_CLASS =", value, "iosClass");
            return (Criteria) this;
        }

        public Criteria andIosClassNotEqualTo(String value) {
            addCriterion("IOS_CLASS <>", value, "iosClass");
            return (Criteria) this;
        }

        public Criteria andIosClassGreaterThan(String value) {
            addCriterion("IOS_CLASS >", value, "iosClass");
            return (Criteria) this;
        }

        public Criteria andIosClassGreaterThanOrEqualTo(String value) {
            addCriterion("IOS_CLASS >=", value, "iosClass");
            return (Criteria) this;
        }

        public Criteria andIosClassLessThan(String value) {
            addCriterion("IOS_CLASS <", value, "iosClass");
            return (Criteria) this;
        }

        public Criteria andIosClassLessThanOrEqualTo(String value) {
            addCriterion("IOS_CLASS <=", value, "iosClass");
            return (Criteria) this;
        }

        public Criteria andIosClassLike(String value) {
            addCriterion("IOS_CLASS like", value, "iosClass");
            return (Criteria) this;
        }

        public Criteria andIosClassNotLike(String value) {
            addCriterion("IOS_CLASS not like", value, "iosClass");
            return (Criteria) this;
        }

        public Criteria andIosClassIn(List<String> values) {
            addCriterion("IOS_CLASS in", values, "iosClass");
            return (Criteria) this;
        }

        public Criteria andIosClassNotIn(List<String> values) {
            addCriterion("IOS_CLASS not in", values, "iosClass");
            return (Criteria) this;
        }

        public Criteria andIosClassBetween(String value1, String value2) {
            addCriterion("IOS_CLASS between", value1, value2, "iosClass");
            return (Criteria) this;
        }

        public Criteria andIosClassNotBetween(String value1, String value2) {
            addCriterion("IOS_CLASS not between", value1, value2, "iosClass");
            return (Criteria) this;
        }

        public Criteria andAndroidIconIsNull() {
            addCriterion("ANDROID_ICON is null");
            return (Criteria) this;
        }

        public Criteria andAndroidIconIsNotNull() {
            addCriterion("ANDROID_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidIconEqualTo(String value) {
            addCriterion("ANDROID_ICON =", value, "androidIcon");
            return (Criteria) this;
        }

        public Criteria andAndroidIconNotEqualTo(String value) {
            addCriterion("ANDROID_ICON <>", value, "androidIcon");
            return (Criteria) this;
        }

        public Criteria andAndroidIconGreaterThan(String value) {
            addCriterion("ANDROID_ICON >", value, "androidIcon");
            return (Criteria) this;
        }

        public Criteria andAndroidIconGreaterThanOrEqualTo(String value) {
            addCriterion("ANDROID_ICON >=", value, "androidIcon");
            return (Criteria) this;
        }

        public Criteria andAndroidIconLessThan(String value) {
            addCriterion("ANDROID_ICON <", value, "androidIcon");
            return (Criteria) this;
        }

        public Criteria andAndroidIconLessThanOrEqualTo(String value) {
            addCriterion("ANDROID_ICON <=", value, "androidIcon");
            return (Criteria) this;
        }

        public Criteria andAndroidIconLike(String value) {
            addCriterion("ANDROID_ICON like", value, "androidIcon");
            return (Criteria) this;
        }

        public Criteria andAndroidIconNotLike(String value) {
            addCriterion("ANDROID_ICON not like", value, "androidIcon");
            return (Criteria) this;
        }

        public Criteria andAndroidIconIn(List<String> values) {
            addCriterion("ANDROID_ICON in", values, "androidIcon");
            return (Criteria) this;
        }

        public Criteria andAndroidIconNotIn(List<String> values) {
            addCriterion("ANDROID_ICON not in", values, "androidIcon");
            return (Criteria) this;
        }

        public Criteria andAndroidIconBetween(String value1, String value2) {
            addCriterion("ANDROID_ICON between", value1, value2, "androidIcon");
            return (Criteria) this;
        }

        public Criteria andAndroidIconNotBetween(String value1, String value2) {
            addCriterion("ANDROID_ICON not between", value1, value2, "androidIcon");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgIsNull() {
            addCriterion("ANDROID_PKG is null");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgIsNotNull() {
            addCriterion("ANDROID_PKG is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgEqualTo(String value) {
            addCriterion("ANDROID_PKG =", value, "androidPkg");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNotEqualTo(String value) {
            addCriterion("ANDROID_PKG <>", value, "androidPkg");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgGreaterThan(String value) {
            addCriterion("ANDROID_PKG >", value, "androidPkg");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgGreaterThanOrEqualTo(String value) {
            addCriterion("ANDROID_PKG >=", value, "androidPkg");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgLessThan(String value) {
            addCriterion("ANDROID_PKG <", value, "androidPkg");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgLessThanOrEqualTo(String value) {
            addCriterion("ANDROID_PKG <=", value, "androidPkg");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgLike(String value) {
            addCriterion("ANDROID_PKG like", value, "androidPkg");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNotLike(String value) {
            addCriterion("ANDROID_PKG not like", value, "androidPkg");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgIn(List<String> values) {
            addCriterion("ANDROID_PKG in", values, "androidPkg");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNotIn(List<String> values) {
            addCriterion("ANDROID_PKG not in", values, "androidPkg");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgBetween(String value1, String value2) {
            addCriterion("ANDROID_PKG between", value1, value2, "androidPkg");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNotBetween(String value1, String value2) {
            addCriterion("ANDROID_PKG not between", value1, value2, "androidPkg");
            return (Criteria) this;
        }

        public Criteria andAndroidClassIsNull() {
            addCriterion("ANDROID_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andAndroidClassIsNotNull() {
            addCriterion("ANDROID_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidClassEqualTo(String value) {
            addCriterion("ANDROID_CLASS =", value, "androidClass");
            return (Criteria) this;
        }

        public Criteria andAndroidClassNotEqualTo(String value) {
            addCriterion("ANDROID_CLASS <>", value, "androidClass");
            return (Criteria) this;
        }

        public Criteria andAndroidClassGreaterThan(String value) {
            addCriterion("ANDROID_CLASS >", value, "androidClass");
            return (Criteria) this;
        }

        public Criteria andAndroidClassGreaterThanOrEqualTo(String value) {
            addCriterion("ANDROID_CLASS >=", value, "androidClass");
            return (Criteria) this;
        }

        public Criteria andAndroidClassLessThan(String value) {
            addCriterion("ANDROID_CLASS <", value, "androidClass");
            return (Criteria) this;
        }

        public Criteria andAndroidClassLessThanOrEqualTo(String value) {
            addCriterion("ANDROID_CLASS <=", value, "androidClass");
            return (Criteria) this;
        }

        public Criteria andAndroidClassLike(String value) {
            addCriterion("ANDROID_CLASS like", value, "androidClass");
            return (Criteria) this;
        }

        public Criteria andAndroidClassNotLike(String value) {
            addCriterion("ANDROID_CLASS not like", value, "androidClass");
            return (Criteria) this;
        }

        public Criteria andAndroidClassIn(List<String> values) {
            addCriterion("ANDROID_CLASS in", values, "androidClass");
            return (Criteria) this;
        }

        public Criteria andAndroidClassNotIn(List<String> values) {
            addCriterion("ANDROID_CLASS not in", values, "androidClass");
            return (Criteria) this;
        }

        public Criteria andAndroidClassBetween(String value1, String value2) {
            addCriterion("ANDROID_CLASS between", value1, value2, "androidClass");
            return (Criteria) this;
        }

        public Criteria andAndroidClassNotBetween(String value1, String value2) {
            addCriterion("ANDROID_CLASS not between", value1, value2, "androidClass");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNull() {
            addCriterion("APP_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNotNull() {
            addCriterion("APP_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionEqualTo(String value) {
            addCriterion("APP_VERSION =", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotEqualTo(String value) {
            addCriterion("APP_VERSION <>", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThan(String value) {
            addCriterion("APP_VERSION >", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("APP_VERSION >=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThan(String value) {
            addCriterion("APP_VERSION <", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThanOrEqualTo(String value) {
            addCriterion("APP_VERSION <=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLike(String value) {
            addCriterion("APP_VERSION like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotLike(String value) {
            addCriterion("APP_VERSION not like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionIn(List<String> values) {
            addCriterion("APP_VERSION in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotIn(List<String> values) {
            addCriterion("APP_VERSION not in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionBetween(String value1, String value2) {
            addCriterion("APP_VERSION between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotBetween(String value1, String value2) {
            addCriterion("APP_VERSION not between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andEnterTypeIsNull() {
            addCriterion("ENTER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEnterTypeIsNotNull() {
            addCriterion("ENTER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEnterTypeEqualTo(String value) {
            addCriterion("ENTER_TYPE =", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeNotEqualTo(String value) {
            addCriterion("ENTER_TYPE <>", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeGreaterThan(String value) {
            addCriterion("ENTER_TYPE >", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTER_TYPE >=", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeLessThan(String value) {
            addCriterion("ENTER_TYPE <", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeLessThanOrEqualTo(String value) {
            addCriterion("ENTER_TYPE <=", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeLike(String value) {
            addCriterion("ENTER_TYPE like", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeNotLike(String value) {
            addCriterion("ENTER_TYPE not like", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeIn(List<String> values) {
            addCriterion("ENTER_TYPE in", values, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeNotIn(List<String> values) {
            addCriterion("ENTER_TYPE not in", values, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeBetween(String value1, String value2) {
            addCriterion("ENTER_TYPE between", value1, value2, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeNotBetween(String value1, String value2) {
            addCriterion("ENTER_TYPE not between", value1, value2, "enterType");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeIsNull() {
            addCriterion("WINDOW_OPEN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeIsNotNull() {
            addCriterion("WINDOW_OPEN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeEqualTo(String value) {
            addCriterion("WINDOW_OPEN_TYPE =", value, "windowOpenType");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeNotEqualTo(String value) {
            addCriterion("WINDOW_OPEN_TYPE <>", value, "windowOpenType");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeGreaterThan(String value) {
            addCriterion("WINDOW_OPEN_TYPE >", value, "windowOpenType");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WINDOW_OPEN_TYPE >=", value, "windowOpenType");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeLessThan(String value) {
            addCriterion("WINDOW_OPEN_TYPE <", value, "windowOpenType");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeLessThanOrEqualTo(String value) {
            addCriterion("WINDOW_OPEN_TYPE <=", value, "windowOpenType");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeLike(String value) {
            addCriterion("WINDOW_OPEN_TYPE like", value, "windowOpenType");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeNotLike(String value) {
            addCriterion("WINDOW_OPEN_TYPE not like", value, "windowOpenType");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeIn(List<String> values) {
            addCriterion("WINDOW_OPEN_TYPE in", values, "windowOpenType");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeNotIn(List<String> values) {
            addCriterion("WINDOW_OPEN_TYPE not in", values, "windowOpenType");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeBetween(String value1, String value2) {
            addCriterion("WINDOW_OPEN_TYPE between", value1, value2, "windowOpenType");
            return (Criteria) this;
        }

        public Criteria andWindowOpenTypeNotBetween(String value1, String value2) {
            addCriterion("WINDOW_OPEN_TYPE not between", value1, value2, "windowOpenType");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(BigDecimal value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(BigDecimal value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(BigDecimal value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(BigDecimal value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<BigDecimal> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<BigDecimal> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(BigDecimal value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(BigDecimal value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(BigDecimal value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<BigDecimal> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNull() {
            addCriterion("SYSTEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNotNull() {
            addCriterion("SYSTEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeEqualTo(BigDecimal value) {
            addCriterion("SYSTEM_TYPE =", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotEqualTo(BigDecimal value) {
            addCriterion("SYSTEM_TYPE <>", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThan(BigDecimal value) {
            addCriterion("SYSTEM_TYPE >", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYSTEM_TYPE >=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThan(BigDecimal value) {
            addCriterion("SYSTEM_TYPE <", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYSTEM_TYPE <=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIn(List<BigDecimal> values) {
            addCriterion("SYSTEM_TYPE in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotIn(List<BigDecimal> values) {
            addCriterion("SYSTEM_TYPE not in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYSTEM_TYPE between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYSTEM_TYPE not between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andPcIconIsNull() {
            addCriterion("PC_ICON is null");
            return (Criteria) this;
        }

        public Criteria andPcIconIsNotNull() {
            addCriterion("PC_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andPcIconEqualTo(String value) {
            addCriterion("PC_ICON =", value, "pcIcon");
            return (Criteria) this;
        }

        public Criteria andPcIconNotEqualTo(String value) {
            addCriterion("PC_ICON <>", value, "pcIcon");
            return (Criteria) this;
        }

        public Criteria andPcIconGreaterThan(String value) {
            addCriterion("PC_ICON >", value, "pcIcon");
            return (Criteria) this;
        }

        public Criteria andPcIconGreaterThanOrEqualTo(String value) {
            addCriterion("PC_ICON >=", value, "pcIcon");
            return (Criteria) this;
        }

        public Criteria andPcIconLessThan(String value) {
            addCriterion("PC_ICON <", value, "pcIcon");
            return (Criteria) this;
        }

        public Criteria andPcIconLessThanOrEqualTo(String value) {
            addCriterion("PC_ICON <=", value, "pcIcon");
            return (Criteria) this;
        }

        public Criteria andPcIconLike(String value) {
            addCriterion("PC_ICON like", value, "pcIcon");
            return (Criteria) this;
        }

        public Criteria andPcIconNotLike(String value) {
            addCriterion("PC_ICON not like", value, "pcIcon");
            return (Criteria) this;
        }

        public Criteria andPcIconIn(List<String> values) {
            addCriterion("PC_ICON in", values, "pcIcon");
            return (Criteria) this;
        }

        public Criteria andPcIconNotIn(List<String> values) {
            addCriterion("PC_ICON not in", values, "pcIcon");
            return (Criteria) this;
        }

        public Criteria andPcIconBetween(String value1, String value2) {
            addCriterion("PC_ICON between", value1, value2, "pcIcon");
            return (Criteria) this;
        }

        public Criteria andPcIconNotBetween(String value1, String value2) {
            addCriterion("PC_ICON not between", value1, value2, "pcIcon");
            return (Criteria) this;
        }

        public Criteria andAppUrlIsNull() {
            addCriterion("APP_URL is null");
            return (Criteria) this;
        }

        public Criteria andAppUrlIsNotNull() {
            addCriterion("APP_URL is not null");
            return (Criteria) this;
        }

        public Criteria andAppUrlEqualTo(String value) {
            addCriterion("APP_URL =", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlNotEqualTo(String value) {
            addCriterion("APP_URL <>", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlGreaterThan(String value) {
            addCriterion("APP_URL >", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlGreaterThanOrEqualTo(String value) {
            addCriterion("APP_URL >=", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlLessThan(String value) {
            addCriterion("APP_URL <", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlLessThanOrEqualTo(String value) {
            addCriterion("APP_URL <=", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlLike(String value) {
            addCriterion("APP_URL like", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlNotLike(String value) {
            addCriterion("APP_URL not like", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlIn(List<String> values) {
            addCriterion("APP_URL in", values, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlNotIn(List<String> values) {
            addCriterion("APP_URL not in", values, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlBetween(String value1, String value2) {
            addCriterion("APP_URL between", value1, value2, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlNotBetween(String value1, String value2) {
            addCriterion("APP_URL not between", value1, value2, "appUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}