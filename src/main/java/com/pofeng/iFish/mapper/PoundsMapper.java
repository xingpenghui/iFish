package com.pofeng.iFish.mapper;

import com.pofeng.iFish.domain.Pounds;
import org.springframework.stereotype.Repository;

@Repository
public interface PoundsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pounds record);

    int insertSelective(Pounds record);

    Pounds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pounds record);

    int updateByPrimaryKey(Pounds record);
}