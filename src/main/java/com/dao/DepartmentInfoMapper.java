package com.dao;

import com.pojo.DepartmentInfo;

import java.util.List;

public interface DepartmentInfoMapper {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(DepartmentInfo record);

    int insertSelective(DepartmentInfo record);

    DepartmentInfo selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(DepartmentInfo record);

    int updateByPrimaryKey(DepartmentInfo record);


    List<DepartmentInfo> searchDepartment();
}