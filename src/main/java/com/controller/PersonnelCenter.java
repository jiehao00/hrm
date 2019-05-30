package com.controller;


import com.pojo.CompanyInfo;
import com.pojo.DossierInfo;
import com.service.CompanyMessageService;
import com.service.DossierService;
import com.util.config.ImageConfig;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
* @Description:    个人中心控制模块
* @Author:         jieHao
* @CreateDate:     2019/5/30 22:16
* @UpdateUser:     jieHao
* @UpdateDate:     2019/5/30 22:16
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
public class PersonnelCenter {
    @Autowired
    private CompanyMessageService companyMessageService;
    @Autowired
    private DossierService dossierService;

    /**
    * 方法实现说明    搜索个人信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/30 22:28
    */
    @RequestMapping("searchPersonnelCenter")
    @ResponseBody
    public Map searchPersonnelCenter(HttpSession session){
        Map<String,Object>map=new HashMap<>();
        Integer personnelId= (Integer) session.getAttribute("personnelId");
        CompanyInfo companyInfo=companyMessageService.searchCompanyMessage();
        DossierInfo dossierInfo=new DossierInfo();
        dossierInfo.setPersonnelId(personnelId);
        DossierInfo record=dossierService.findDossierInfoByPersonnelId(dossierInfo);
        record.setPhoto(ImageConfig.imageUrl+record.getPhoto());
        map.put("companyInfo",companyInfo);
        map.put("dossierInfo",record);
        return map;
    }
}
