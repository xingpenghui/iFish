package com.pofeng.iFish.mapper;

import com.pofeng.iFish.domain.Goodstype;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodstypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    Goodstype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodstype record);

    int updateByPrimaryKey(Goodstype record);
}