package com.ly.springboot.mapper;

import com.ly.springboot.module.ModelTree;
import com.ly.springboot.module.ModelTreeExample;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.List;
@Mapper//扫描DAO接口到Spring容器
public interface ModelTreeMapper {
    int deleteByExample(ModelTreeExample example);

    int deleteByPrimaryKey(BigDecimal sysModelId);

    int insert(ModelTree record);

    int insertSelective(ModelTree record);

    List<ModelTree> selectByExample(ModelTreeExample example);

    ModelTree selectByPrimaryKey(BigDecimal sysModelId);

    int updateByPrimaryKeySelective(ModelTree record);

    int updateByPrimaryKey(ModelTree record);
}