package com.pofeng.iFish.mapper;

import com.pofeng.iFish.domain.Pounds;

public interface PoundsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pounds record);

    int insertSelective(Pounds record);

    Pounds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pounds record);

    int updateByPrimaryKey(Pounds record);
}