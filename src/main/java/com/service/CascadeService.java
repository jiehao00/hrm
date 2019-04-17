package com.service;

import com.pojo.DepartmentInfo;
import com.pojo.PositionInfo;

import java.util.List;

/**
* @Description:    部门，职位操作服务类
* @Author:         jiang_jiehao
* @CreateDate:     2019/3/29 17:53
* @UpdateUser:     jiang_jiehao
* @UpdateDate:     2019/3/29 17:53
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface CascadeService {

    /**
     * 方法实现说明   查找部门（级联）
     * @author      jiang_jiehao
     *@param: null
     * @return
     * @exception
     * @date        2019/3/29 17:52
     */
     List<DepartmentInfo> searchDepartment();

    /**
     * 方法实现说明   根据部门id查找职位
     * @author      jiang_jiehao
     *@param: null
     * @return
     * @exception
     * @date        2019/3/29 17:52
     */
    List<PositionInfo> searchPosition(Integer departmentId);


    /**
    * 方法实现说明 根据部门id查找部门信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/2 18:15
    */
    DepartmentInfo searchDepartmentById(Integer departmentId);

    /**
    * 方法实现说明  根据职位id查找职位信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/2 18:16
    */
    PositionInfo searchPositionById(Integer positionId);


    List<PositionInfo> searchPositionALL();

}
