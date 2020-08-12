package com.ly.springboot.service;

import com.ly.springboot.mapper.ModelTreeMapper;
import com.ly.springboot.module.ModelTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author ly
 * @date: 2020/8/4 14:45
 * @title:
 * @company:zjhcsoft
 * @description:
 */
@Service
public class SysModelTreeService {
    @Autowired
    ModelTreeMapper modelTreeMapper;

    /**
     * 根据主键id获取数据
     * @param id
     * @return
     */
    public ModelTree getSysModelById(BigDecimal id) {
        return modelTreeMapper.selectByPrimaryKey(id);
    }
}
