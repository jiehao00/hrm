package com.util;

import com.pojo.TestMode;

import java.util.ArrayList;
import java.util.List;

/**
* @Description:    LIST数组转树形结构工具类
* @Author:         jieHao
* @CreateDate:     2019/4/17 16:41
* @UpdateUser:     jieHao
* @UpdateDate:     2019/4/17 16:41
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class GetDeptTree {


    /**
    * 方法实现说明   LIST数组转树形结构
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/17 16:42
    */
    public List<TestMode> getTree(List<TestMode> list, Integer pid) {

        List<TestMode> result = new ArrayList<TestMode>();
        List<TestMode> temp = new ArrayList <TestMode>();

        for (TestMode entity : list) {
            if (entity.getParentId().equals(pid)) {
                TestMode deptScopeMode = new TestMode();
                deptScopeMode.setId(entity.getId());
                deptScopeMode.setName(entity.getName());
                deptScopeMode.setParentId(entity.getParentId());
                temp = getTree(list, entity.getId());
                if (temp.size() > 0) {
                    deptScopeMode.setChildren(temp);
                }
                result.add(deptScopeMode);
            }
        }
        return result;
    }
}
