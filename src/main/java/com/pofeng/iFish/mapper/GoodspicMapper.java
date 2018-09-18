package com.pofeng.iFish.mapper;

import com.pofeng.iFish.domain.Goodspic;

public interface GoodspicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodspic record);

    int insertSelective(Goodspic record);

    Goodspic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodspic record);

    int updateByPrimaryKey(Goodspic record);
}