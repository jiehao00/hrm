package com.dao;

import com.pojo.DepartmentInfo;
import com.pojo.PositionInfo;
import org.apache.ibatis.annotations.Param;

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


    /**
    * 方法实现说明 查询全部职位信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 22:00
    */
    List<PositionInfo> searchPositionALL();

    /**
    * 方法实现说明 分页模糊查询职位信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 22:00
    */
    List<PositionInfo>searchAllPositionByPaging(@Param("start")int start, @Param("limit")int limit, @Param("positionInfo")PositionInfo positionInfo);

    /**
    * 方法实现说明  查找职位数量
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/27 18:11
    */
    int searchAllPositionCount();

    /**
    * 方法实现说明 查找职位是否存在
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/27 18:12
    */
    PositionInfo searchIsExitPosition(PositionInfo positionInfo);

    /**
    * 方法实现说明 查找存在相同部门职位数量
     * * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/28 12:42
    */
    int searchPositionExitCount(PositionInfo positionInfo);




}