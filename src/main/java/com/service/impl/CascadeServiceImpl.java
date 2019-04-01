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
}
