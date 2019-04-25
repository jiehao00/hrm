package com.controller;

import com.pojo.DepartmentInfo;
import com.pojo.PositionInfo;
import com.service.CascadeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Description:    部门职位操作控制类(部门，职位)
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

    /**
    * 方法实现说明  搜索部门信息（带模糊查询）
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 14:47
    */
    @RequestMapping("searchAllDepartmentByPaging")
    @ResponseBody
    public Map searchAllDepartmentByPaging(int page, int limit,DepartmentInfo departmentInfo){
        Map<String,Object>map=new HashMap<>();
        int start = (page-1)*limit;
        if (departmentInfo.getDepartment()==""){
            departmentInfo.setDepartment(null);
        }if (departmentInfo.getDeparmentIntroduction()==""){
            departmentInfo.setDeparmentIntroduction(null);
        }
        List<DepartmentInfo>departmentInfos=cascadeService.searchAllDepartmentByPaging(start,limit,departmentInfo);
        int count =cascadeService.searchAllDepartmentCount();
        map.put("code",0);
        map.put("count",count);
        map.put("data",departmentInfos);
        return map;
    }


    /**
    * 方法实现说明 添加部门（添加部门是否已存在功能）
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 17:14
    */
    @RequestMapping("addDepartment")
    @ResponseBody
    public Map addDepartment(DepartmentInfo departmentInfo){
        Map<String,Object>map=new HashMap<>();
        if (cascadeService.searchIsExitDepartment(departmentInfo)!=null){
            map.put("status",2);
            map.put("message","部门已存在");
        }else{
            if (cascadeService.addDepartment(departmentInfo)>0){
                map.put("status",0);
                map.put("message","添加成功");
            }
            else {
                map.put("status",1);
                map.put("message","添加失败");
            }
        }
        return map;
    }
    /**
    * 方法实现说明 更新部门
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 19:47
    */
    @RequestMapping("updateDepartment")
    @ResponseBody
    public Map updateDepartment(DepartmentInfo departmentInfo){
        Map<String,Object>map=new HashMap<>();
        if (cascadeService.updateDepartment(departmentInfo)>0){
            map.put("status",0);
            map.put("message","更新成功");
        }
        else {
            map.put("status",1);
            map.put("message","更新失败");
        }
        return map;
    }

    /**
    * 方法实现说明  删除部门
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 20:22
    */
    @RequestMapping("delDepartment")
    @ResponseBody
    public Map delDepartment(DepartmentInfo departmentInfo){
        Map<String,Object>map=new HashMap<>();
        List<PositionInfo> positionInfos=cascadeService.searchPosition(departmentInfo.getDepartmentId());
        if (positionInfos!=null&&!positionInfos.isEmpty()){
            map.put("status",0);
            map.put("message","该部门下有职位，不能删除");
        }
        else{
            if (cascadeService.delDepartment(departmentInfo.getDepartmentId())>0){
                map.put("status",1);
                map.put("message","删除成功");
            }else{
                map.put("status",2);
                map.put("message","删除失败");
            }

        }
        return map;
    }

    /**
    * 方法实现说明  分页模糊查询职位信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/25 20:25
    */
    @RequestMapping("searchAllPositionByPaging")
    @ResponseBody
    public Map searchAllPositionByPaging(int page, int limit,PositionInfo positionInfo){
        Map<String,Object>map=new HashMap<>();
        int start = (page-1)*limit;
        if (positionInfo.getPosition()==""){
            positionInfo.setPosition(null);
        }
        if (positionInfo.getDepartment()==""){
            positionInfo.setDepartment(null);
        }
        List<PositionInfo> positionInfos=cascadeService.searchAllPositionByPaging(start,limit,positionInfo);
        int count=cascadeService.searchAllPositionCount();
        map.put("code",0);
        map.put("count",count);
        map.put("data",positionInfos);
        return map;
    }





}
