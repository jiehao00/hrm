package com.service.impl;

import com.dao.DepartmentInfoMapper;
import com.dao.PositionInfoMapper;
import com.pojo.DepartmentInfo;
import com.pojo.PositionInfo;
import com.service.CascadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
* @Description:    部门，职位服务实现类
* @Author:         jiang_jiehao
* @CreateDate:     2019/3/29 17:55
* @UpdateUser:     jiang_jiehao
* @UpdateDate:     2019/3/29 17:55
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class CascadeServiceImpl implements CascadeService {

    @Autowired
    private DepartmentInfoMapper departmentInfoMapper;
    @Autowired
    private PositionInfoMapper positionInfoMapper;



    /**
     * 方法实现说明   查找部门（级联）
     * @author      jiang_jiehao
     *@param: null
     * @return
     * @exception
     * @date        2019/3/29 17:52
     */
    @Override
    public List<DepartmentInfo> searchDepartment() {
        return departmentInfoMapper.searchDepartment();
    }

    /**
     * 方法实现说明   根据部门id查找职位
     * @author      jiang_jiehao
     *@param: null
     * @return
     * @exception
     * @date        2019/3/29 17:52
     */
    @Override
    public List<PositionInfo> searchPosition(Integer departmentId) {
        return positionInfoMapper.searchPosition(departmentId);
    }

    /**
    * 方法实现说明  根据部门id查找部门信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/2 18:17
    */
    @Override
    public DepartmentInfo searchDepartmentById(Integer departmentId) {
        return departmentInfoMapper.selectByPrimaryKey(departmentId);
    }

    /**
     * 方法实现说明 根据职位id查找职位信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/2 18:17
    */
    @Override
    public PositionInfo searchPositionById(Integer positionId) {
        return positionInfoMapper.searchPositionById(positionId);
    }

    /**
    * 方法实现说明 查找所有职位
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 15:08
    */
    @Override
    public List<PositionInfo> searchPositionALL() {
        return positionInfoMapper.searchPositionALL();
    }

    /**
    * 方法实现说明 分页模糊查询 查找部门
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 15:08
    */
    @Override
    public List<DepartmentInfo> searchAllDepartmentByPaging(int start, int limit, DepartmentInfo departmentInfo) {
        return departmentInfoMapper.searchAllDepartmentByPaging(start,limit,departmentInfo);
    }

    /**
    * 方法实现说明 查找部门总数
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 15:08
    */
    @Override
    public int searchAllDepartmentCount() {
        return departmentInfoMapper.searchAllDepartmentCount();
    }

    /**
    * 方法实现说明 添加部门
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 17:12
    */
    @Override
    public int addDepartment(DepartmentInfo departmentInfo) {
        return departmentInfoMapper.insertSelective(departmentInfo);
    }

    /**
    * 方法实现说明 更新部门
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 17:59
    */
    @Override
    public int updateDepartment(DepartmentInfo departmentInfo) {
        return departmentInfoMapper.updateByPrimaryKeySelective(departmentInfo);
    }

    /**
    * 方法实现说明  删除部门
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 19:24
    */
    @Override
    public int delDepartment(Integer departmentId) {
        return departmentInfoMapper.deleteByPrimaryKey(departmentId);
    }

    /**
    * 方法实现说明 分页模糊查询职位
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 22:00
    */
    @Override
    public List<PositionInfo> searchAllPositionByPaging(int start, int limit, PositionInfo positionInfo) {
        return positionInfoMapper.searchAllPositionByPaging(start,limit,positionInfo);
    }

    /**
    * 方法实现说明  搜索全部职位数量
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 22:14
    */
    @Override
    public int searchAllPositionCount() {
        return positionInfoMapper.searchAllPositionCount();
    }

    /**
    * 方法实现说明 查询部门是否已存在
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 22:40
    */
    @Override
    public DepartmentInfo searchIsExitDepartment(DepartmentInfo departmentInfo) {
        return departmentInfoMapper.searchIsExitDepartment(departmentInfo);
    }

    /**
    * 方法实现说明 查找职位是否存在
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/27 18:10
    */
    @Override
    public PositionInfo searchIsExitPosition(PositionInfo positionInfo) {
        return positionInfoMapper.searchIsExitPosition(positionInfo);
    }

    /**
    * 方法实现说明 增加职位
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/27 18:39
    */
    @Override
    public int addPosition(PositionInfo positionInfo) {
        return positionInfoMapper.insertSelective(positionInfo);
    }

    /**
    * 方法实现说明  更新职位
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/27 19:21
    */
    @Override
    public int updatePosition(PositionInfo positionInfo) {
        return positionInfoMapper.updateByPrimaryKeySelective(positionInfo);
    }

    /**
    * 方法实现说明 查找存在相同部门职位数量
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/28 12:43
    */
    @Override
    public int searchPositionExitCount(PositionInfo positionInfo) {
        return positionInfoMapper.searchPositionExitCount(positionInfo);
    }

    @Override
    public int delPosition(Integer positionId) {
        return positionInfoMapper.deleteByPrimaryKey(positionId);
    }
}
