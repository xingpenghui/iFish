package com.pofeng.iFish.mapper;

import com.pofeng.iFish.domain.Buy;

public interface BuyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Buy record);

    int insertSelective(Buy record);

    Buy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Buy record);

    int updateByPrimaryKey(Buy record);
}