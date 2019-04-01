package com.controller;

import com.pojo.DepartmentInfo;
import com.pojo.PositionInfo;
import com.service.CascadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Description:    级联操作控制类(部门，职位)
* @Author:         jiang_jiehao
* @CreateDate:     2019/3/29 17:50
* @UpdateUser:     jiang_jiehao
* @UpdateDate:     2019/3/29 17:50
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
public class CascadeController {


    @Autowired
    private CascadeService cascadeService;


    /**
    * 方法实现说明   查找部门（级联）
    * @author      jiang_jiehao
    *@param: null
    * @return
    * @exception
    * @date        2019/3/29 17:52
    */
    @RequestMapping("searchDepartment")
    @ResponseBody
    public Map searchDepartment(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<DepartmentInfo> departmentInfo=cascadeService.searchDepartment();

        map.put("department",departmentInfo);
        return map;
    }

    /**
    * 方法实现说明   根据部门id查找职位
    * @author      jiang_jiehao
    *@param: null
    * @return
    * @exception
    * @date        2019/3/29 17:52
    */
    @RequestMapping("searchPosition")
    @ResponseBody
    public Map searchPosition(int departmentId){
        Map<String, Object> map = new HashMap<String, Object>();
        List<PositionInfo> positionInfo=cascadeService.searchPosition(departmentId);
        map.put("positionInfo",positionInfo);
        return map;
    }
}
