package com.dao;

import com.pojo.TerminationInfo;

public interface TerminationInfoMapper {
    int deleteByPrimaryKey(Integer terminationId);

    int insert(TerminationInfo record);

    int insertSelective(TerminationInfo record);

    TerminationInfo selectByPrimaryKey(Integer terminationId);

    int updateByPrimaryKeySelective(TerminationInfo record);

    int updateByPrimaryKey(TerminationInfo record);
}