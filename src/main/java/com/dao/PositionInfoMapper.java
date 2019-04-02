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


    /**
    * 方法实现说明 根据职位id查找职位信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/2 18:19
    */
    PositionInfo searchPositionById(Integer positionId);
}