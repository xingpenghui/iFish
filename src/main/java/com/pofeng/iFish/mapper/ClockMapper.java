package com.pofeng.iFish.mapper;

import com.pofeng.iFish.domain.Clock;
import org.springframework.stereotype.Repository;

@Repository
public interface ClockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Clock record);

    int insertSelective(Clock record);

    Clock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Clock record);

    int updateByPrimaryKey(Clock record);
}