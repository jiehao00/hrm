package com.dao;

import com.pojo.PositionInfo;

import java.util.List;

public interface PositionInfoMapper {
    int deleteByPrimaryKey(Integer positionId);

    int insert(PositionInfo record);

    int insertSelective(PositionInfo record);

    PositionInfo selectByPrimaryKey(Integer positionId);

    int updateByPrimaryKeySelective(PositionInfo record);

    int updateByPrimaryKey(PositionInfo record);


    List<PositionInfo> searchPosition(Integer departmentId);
}