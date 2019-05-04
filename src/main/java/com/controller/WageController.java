package com.controller;


import com.pojo.RewardsInfo;
import com.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("delRewards")
    @ResponseBody
    public Map delRewards(RewardsInfo rewardsInfo){
        Map<String,Object> map=new HashMap<>();
        System.out.println(rewardsInfo.getRewardTime());
        System.out.println(rewardsInfo.getPersonnelId());
        if (rewardsService.delRewards(rewardsInfo.getRewardsId())>0){
            map.put("status",0);
            map.put("message","删除成功");
        }else {
            map.put("status",1);
            map.put("message","删除失败");
        }
        return map;
    }
}
