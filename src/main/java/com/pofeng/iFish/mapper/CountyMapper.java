package com.pofeng.iFish.mapper;

import com.pofeng.iFish.domain.County;
import org.springframework.stereotype.Repository;

@Repository
public interface CountyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(County record);

    int insertSelective(County record);

    County selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKey(County record);
}