package com.dao;

import com.pojo.DepartmentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
* @Description:    部门操作数据库操作接口
* @Author:         jieHao
* @CreateDate:     2019/4/25 14:56
* @UpdateUser:     jieHao
* @UpdateDate:     2019/4/25 14:56
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface DepartmentInfoMapper {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(DepartmentInfo record);

    int insertSelective(DepartmentInfo record);

    DepartmentInfo selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(DepartmentInfo record);

    int updateByPrimaryKey(DepartmentInfo record);


    List<DepartmentInfo> searchDepartment();

    /**
    * 方法实现说明  分页。模糊查询部门
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 14:56
    */
    List<DepartmentInfo> searchAllDepartmentByPaging (@Param("start")int start,@Param("limit")int limit, @Param("departmentInfo")DepartmentInfo departmentInfo);

    /**
    * 方法实现说明  查询部门总数
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 15:07
    */
    int searchAllDepartmentCount();

    DepartmentInfo searchIsExitDepartment(DepartmentInfo departmentInfo);
}