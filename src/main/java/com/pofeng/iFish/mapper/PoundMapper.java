package com.pofeng.iFish.mapper;

import com.pofeng.iFish.domain.Pound;
import org.springframework.stereotype.Repository;

@Repository
public interface PoundMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pound record);

    int insertSelective(Pound record);

    Pound selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pound record);

    int updateByPrimaryKey(Pound record);
}