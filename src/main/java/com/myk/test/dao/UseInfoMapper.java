package com.myk.test.dao;

import com.myk.test.entity.UseInfo;

public interface UseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseInfo record);

    int insertSelective(UseInfo record);

    UseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseInfo record);

    int updateByPrimaryKey(UseInfo record);
}