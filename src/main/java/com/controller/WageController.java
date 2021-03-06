package com.controller;


import com.pojo.*;
import com.service.PunishmentService;
import com.service.RewardsService;
import com.service.WageService;
import com.util.GetYearAndMonthUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
* @Description:    薪酬管理控制类
* @Author:         jieHao
* @CreateDate:     2019/5/4 14:45
* @UpdateUser:     jieHao
* @UpdateDate:     2019/5/4 14:45
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
public class WageController {
    @Autowired
    private RewardsService rewardsService;
    @Autowired
    private PunishmentService punishmentService;
    @Autowired
    private WageService wageService;




    /**
    * 方法实现说明   添加奖赏原因
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/4 16:47
    */
    @RequestMapping("addRewards")
    @ResponseBody
    public Map addRewards(RewardsInfo rewardsInfo){
        Map<String,Object> map=new HashMap<>();
        System.out.println("进入了方法");
        if (rewardsInfo.getAwardMoney()=="" || rewardsInfo.getAwardMoney()==null){
            rewardsInfo.setAwardMoney("0");
        }
        if (rewardsService.insertRewards(rewardsInfo)>0){
            map.put("status",0);
            map.put("message","添加成功");
        }else {
            map.put("status",1);
            map.put("message","添加失败");
        }
        return map;
    }

    /**
    * 方法实现说明  分页模糊查询奖励信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/4 20:41
    */
    @RequestMapping("/searchRewardsMessage")
    @ResponseBody
    public Map searchRewardsMessage(int page, int limit,RewardsInfo rewardsInfo){
        Map<String,Object>map=new HashMap<>();
        int start = (page-1)*limit;
        if (rewardsInfo.getPersonnelName()==""){
            rewardsInfo.setPersonnelName(null);
        } if (rewardsInfo.getRewardTime()==""){
            rewardsInfo.setRewardTime(null);
        }if (rewardsInfo.getDepartment()==""){
            rewardsInfo.setDepartment(null);
        }if (rewardsInfo.getPosition()==""){
            rewardsInfo.setPosition(null);
        }if (rewardsInfo.getStartTime()==""){
            rewardsInfo.setStartTime(null);
        }if (rewardsInfo.getEndTime()==""){
            rewardsInfo.setEndTime(null);
        }
        List<RewardsInfo>rewardsInfos=rewardsService.searchRewardsMessage(start,limit,rewardsInfo);
        int count=rewardsService.searchRewardsCount();
        map.put("code",0);
        map.put("count",count);
        map.put("data",rewardsInfos);
        return map;
    }

    /**
    * 方法实现说明  删除奖励信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/4 20:41
    */
    @RequestMapping("delRewards")
    @ResponseBody
    public Map delRewards(RewardsInfo rewardsInfo){
        Map<String,Object> map=new HashMap<>();
        if (rewardsService.delRewards(rewardsInfo.getRewardsId())>0){
            map.put("status",0);
            map.put("message","删除成功");
        }else {
            map.put("status",1);
            map.put("message","删除失败");
        }
        return map;
    }

    /**
    * 方法实现说明   添加惩罚信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/4 20:50
    */
    @RequestMapping("addPunishment")
    @ResponseBody
    public Map addPunishment(PunishmentInfo punishmentInfo){
        Map<String,Object>map=new HashMap<>();
        if (punishmentInfo.getFinedMoney()=="" || punishmentInfo.getFinedMoney()==null){
            punishmentInfo.setFinedMoney("0");
        }
        if (punishmentService.insertPunishment(punishmentInfo)>0){
            map.put("status",0);
            map.put("message","添加成功");
        }else {
            map.put("status",1);
            map.put("message","添加失败");
        }
        return map;
    }

    /**
    * 方法实现说明 搜索惩罚信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/20 20:16
    */
    @RequestMapping("searchPunishmentMessage")
    @ResponseBody
    public Map searchPunishmentMessage(int page, int limit,PunishmentInfo punishmentInfo){
        Map<String,Object>map=new HashMap<>();

        int start = (page-1)*limit;

        if (punishmentInfo.getPersonnelName()==""){
            punishmentInfo.setPersonnelName(null);
        } if (punishmentInfo.getPunishTime()==""){
            punishmentInfo.setPunishTime(null);
        }if (punishmentInfo.getDepartment()==""){
            punishmentInfo.setDepartment(null);
        }if (punishmentInfo.getPosition()==""){
            punishmentInfo.setPosition(null);
        }if (punishmentInfo.getStartTime()==""){
            punishmentInfo.setStartTime(null);
        }if (punishmentInfo.getEndTime()==""){
            punishmentInfo.setEndTime(null);
        }
        List<PunishmentInfo>punishmentInfos=punishmentService.searchPunishmentMessage(start,limit,punishmentInfo);
        int count=punishmentService.searchPunishmentCount();
        map.put("code",0);
        map.put("count",count);
        map.put("data",punishmentInfos);
        return map;
    }

    /**
    * 方法实现说明  删除惩罚
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/20 20:16
    */
    @RequestMapping("delPunishment")
    @ResponseBody
    public Map delPunishment(PunishmentInfo punishmentInfo){
        Map<String,Object>map=new HashMap<>();

        if (punishmentService.delPunishment(punishmentInfo.getPunishmentId())>0){
            map.put("status",0);
            map.put("message","删除成功");
        }else {
            map.put("status",1);
            map.put("message","删除失败");
        }
        return map;
    }


    /**
    * 方法实现说明 生成当月工资
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/21 0:04
    */
    @RequestMapping("createWage")
    @ResponseBody
    public Map createWage(int page, int limit){
        int start = (page-1)*limit;
        Map<String,Object>map=new HashMap<>();
        GetYearAndMonthUtil getTimeUtil=new GetYearAndMonthUtil();
        ProInsurance proInsurance =wageService.searchProInsurance();
        if (proInsurance.getProOfEmploymentInsurance()==null){
            proInsurance.setProOfEmploymentInsurance(0.00);
        }if (proInsurance.getProOfHousingFund()==null){
            proInsurance.setProOfHousingFund(0.00);
        }if (proInsurance.getProOfInjuryInsurance()==null){
            proInsurance.setProOfInjuryInsurance(0.00);
        }if (proInsurance.getProOfMaternityInsurance()==null){
            proInsurance.setProOfMaternityInsurance(0.00);
        }if (proInsurance.getProOfMedicalInsurance()==null){
            proInsurance.setProOfMedicalInsurance(0.00);
        }if (proInsurance.getProOfRetirementInsurance()==null){
            proInsurance.setProOfRetirementInsurance(0.00);
        }
        proInsurance.setYear(getTimeUtil.getYear());
        proInsurance.setMonth(getTimeUtil.getMonth());
        proInsurance.setYearMonth(getTimeUtil.getMonthYear());
        proInsurance.setPreYearMonth(getTimeUtil.getPreMonthYear());
        int del=wageService.delRepeatWage(proInsurance);
        int num=wageService.createWage(proInsurance);
        List<WageInfo> wageInfos=wageService.searchWageInfo(start,limit,proInsurance);
        int count=wageService.searchCount(proInsurance);
        map.put("code",0);
        map.put("count",count);
        map.put("data",wageInfos);
        return map;
    }

    /**
    * 方法实现说明  搜索五险一金比例信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/29 3:24
    */
    @RequestMapping("searchInsurance")
    @ResponseBody
    public Map searchInsurance(int page, int limit){
        Map<String,Object>map=new HashMap<>();
        int start = (page-1)*limit;
        List<ProInsurance> proInsurances=wageService.searchInsurance(start,limit);
        int count=wageService.searchInsuranceCount();
        map.put("code",0);
        map.put("count",count);
        map.put("data",proInsurances);
        return map;
    }


    /**
    * 方法实现说明  更换五险一金比例
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/29 4:08
    */
    @RequestMapping("updateInsurance")
    @ResponseBody
    public Map updateInsurance(ProInsurance proInsurance){
       Map<String,Object>map=new HashMap<>();
       if (wageService.resetState()>0){
           if (wageService.updateState(proInsurance)>0){
               map.put("status",0);
               map.put("message","修改成功");
           }
       }
       else {
           map.put("status",1);
           map.put("message","修改失败");
       }
       return map;
    }

    /**
    * 方法实现说明   增加五险一金比例信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/31 21:27
    */
    @RequestMapping("addInsurance")
    @ResponseBody
    public Map addInsurance(ProInsurance proInsurance){
        Map<String,Object>map=new HashMap<>();
        if (wageService.addInsurance(proInsurance)>0) {
            map.put("status", 0);
            map.put("message", "添加成功");
        }
        else {
            map.put("status", 1);
            map.put("message", "添加失败");
        }
        return map;
    }
}
