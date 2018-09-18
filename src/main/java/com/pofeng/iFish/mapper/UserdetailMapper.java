package com.pofeng.iFish.mapper;

import com.pofeng.iFish.domain.Userdetail;

public interface UserdetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userdetail record);

    int insertSelective(Userdetail record);

    Userdetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userdetail record);

    int updateByPrimaryKey(Userdetail record);
}