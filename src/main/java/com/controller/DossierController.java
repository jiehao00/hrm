package com.controller;

import com.pojo.DepartmentInfo;
import com.pojo.DossierInfo;
import com.pojo.LoginMessage;
import com.pojo.PositionInfo;
import com.service.CascadeService;
import com.service.DossierService;
import com.util.PrimaryKeyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Description:    员工档案操作控制类
* @Author:         jieHao
* @CreateDate:     2019/3/29 18:00
* @UpdateUser:     jieHao
* @UpdateDate:     2019/3/29 18:00
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
public class DossierController {

    @Autowired
    private DossierService dossierService;
    @Autowired
    private CascadeService cascadeService;



    /**
    * @Description:    新增员工
    * @Author:         jieHao
    * @CreateDate:     2019/3/29 18:01
    * @UpdateUser:     jieHao
    * @UpdateDate:     2019/3/29 18:01
    * @UpdateRemark:   修改内容
    * @Version:        1.0
    */
    @RequestMapping(value = "insertDossierInfo",method = RequestMethod.POST)
    @ResponseBody
    public Map insertDossierInfo(DossierInfo dossierInfo){
        Map<String, Object> map = new HashMap<String, Object>();
        String sex="0";
        if (dossierInfo.getPhoto() == "") {
            dossierInfo.setPhoto(null);
        }
        dossierInfo.setPersonnelId(Integer.valueOf(PrimaryKeyUtil.getAllRandomNumber(8)));
        DepartmentInfo departmentInfo=cascadeService.searchDepartmentById(Integer.valueOf(dossierInfo.getDepartment()));
        dossierInfo.setDepartment(departmentInfo.getDepartment());
        PositionInfo positionInfo=cascadeService.searchPositionById(Integer.valueOf(dossierInfo.getPosition()));
        dossierInfo.setPosition(positionInfo.getPosition());
        if (dossierInfo.getSex().equals(sex)){
            dossierInfo.setSex("男");
        }else{
            dossierInfo.setSex("女");
        }
        if(dossierService.insertDossierInfo(dossierInfo)>0){
            map.put("personnelId",dossierInfo.getPersonnelId());
            map.put("personnelName",dossierInfo.getPersonnelName());
            map.put("status",0);
            map.put("message","添加成功");
        }
        else {
            map.put("status",1);
            map.put("message","添加失败");
        }
        return map;
    }

    /**
    * 方法实现说明  搜索员工(模糊查询，id，name，time，department)
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/2 18:05
    */
    @RequestMapping("searchDossierInfo")
    @ResponseBody
    public Map searchDossierInfo(int page, int limit,DossierInfo dossierInfo){
        int start = (page-1)*limit;
        if (dossierInfo.getDepartment() == "") {
            dossierInfo.setDepartment(null);
        }
        if(dossierInfo.getPersonnelName()==""){
            dossierInfo.setPersonnelName(null);
        }if(dossierInfo.getInformationEntryTime()==""){
            dossierInfo.setInformationEntryTime(null);
        }
        Map<String, Object> map = new HashMap<String, Object>();
        List<DossierInfo> dossierInfos=dossierService.searchDossierInfo(start, limit,dossierInfo);
        int count =dossierService.selectCountDossier();
        map.put("code",0);
        map.put("count",count);
        map.put("data",dossierInfos);
        return map;
    }

    /**
    * 方法实现说明 删除员工信息（加删除员工登录信息表信息）
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/2 18:06
    */
    @RequestMapping("delDossierInfo")
    @ResponseBody
    public Map delDossierInfo(DossierInfo dossierInfo){
        Map<String, Object> map = new HashMap<String, Object>();
        if (dossierService.delDossierInfo(dossierInfo)>0){
            map.put("status",0);
            map.put("message","删除成功");
        }
        else {
            map.put("status",1);
            map.put("message","删除失败");
        }
        return map;
    }
}
