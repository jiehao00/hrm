package com.controller;


import com.pojo.CompanyInfo;
import com.service.CompanyMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
* @Description:    公司信息控制类
* @Author:         jieHao
* @CreateDate:     2019/4/23 14:31
* @UpdateUser:     jieHao
* @UpdateDate:     2019/4/23 14:31
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
public class CompanyMessageController {
    @Autowired
    private CompanyMessageService companyMessageService;



    /**
    * 方法实现说明  更新公司信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/23 19:56
    */
    @RequestMapping("updateCompanyMessage")
    @ResponseBody
    public Map updateCompanyMessage(CompanyInfo companyInfo){
        Map<String,Object>map=new HashMap<>();
        if (companyMessageService.updateCompanyMessage(companyInfo)>0){
            map.put("status",0);
            map.put("message","更新成功");
        }else {
            map.put("status",1);
            map.put("message","更新失败");
        }
        return map;
    }

    /**
    * 方法实现说明 搜索公司信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/23 19:57
    */
    @RequestMapping("searchCompanyMessage")
    @ResponseBody
    public Map searchCompanyMessage(){
        Map<String,Object>map=new HashMap<>();
        CompanyInfo companyInfo=companyMessageService.searchCompanyMessage();
        map.put("company",companyInfo);
        return map;
    }

}
