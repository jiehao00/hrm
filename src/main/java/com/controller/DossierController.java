package com.controller;

import com.pojo.DossierInfo;
import com.pojo.LoginMessage;
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
        if (dossierInfo.getPhoto() == "") {
            dossierInfo.setPhoto(null);
        }
        dossierInfo.setPersonnelId(Integer.valueOf(PrimaryKeyUtil.getAllRandomNumber(8)));
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

    @RequestMapping("searchDossierInfo")
    @ResponseBody
    public Map searchDossierInfo(int page, int limit){
        System.out.println("进入了方法");
        System.out.println(page);
        System.out.println(limit);
        int start = (page-1)*limit;
        Map<String, Object> map = new HashMap<String, Object>();
        List<DossierInfo> dossierInfos=dossierService.searchDossierInfo(start, limit);
        int count =dossierService.selectCountDossier();
        System.out.println("555");
        map.put("code",0);
        map.put("count",count);
        map.put("data",dossierInfos);
        System.out.println("123");
        return map;
    }




}
