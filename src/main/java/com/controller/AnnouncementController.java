package com.controller;


import com.pojo.Announcement;
import com.pojo.ProInsurance;
import com.pojo.PunishmentInfo;
import com.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
* @Description:    公告模块控制类
* @Author:         jieHao
* @CreateDate:     2019/5/31 21:08
* @UpdateUser:     jieHao
* @UpdateDate:     2019/5/31 21:08
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    /**
    * 方法实现说明   搜索公告模块
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/31 21:09
    */
    @RequestMapping("searchAnnouncement")
    @ResponseBody
    public Map searchAnnouncement(){
        Map<String,Object>map=new HashMap<>();
        Announcement announcement=announcementService.searchAnnouncement();
        map.put("announcement",announcement);
        return map;
    }

    /**
    * 方法实现说明  搜索公告内容
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/31 21:26
    */
    @RequestMapping("searchAllAnnouncement")
    @ResponseBody
    public Map searchAllAnnouncement(int page, int limit){
        Map<String,Object> map=new HashMap<>();
        int start = (page-1)*limit;
        List<Announcement> announcements=announcementService.searchAllAnnouncement(start,limit);
        int count=announcementService.searchCount();
        map.put("code",0);
        map.put("count",count);
        map.put("data",announcements);
        return map;
    }

    /**
    * 方法实现说明  更新公告
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/31 22:10
    */
    @RequestMapping("updateState")
    @ResponseBody
    public Map updateState(Announcement announcement){
        Map<String,Object>map=new HashMap<>();
        if (announcementService.resetState()>0){
            if (announcementService.updateAnnouncementState(announcement)>0){
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

    @RequestMapping("addAnnouncement")
    @ResponseBody
    public Map addAnnouncement(Announcement announcement){
        Map<String,Object>map=new HashMap<>();
        if (announcementService.addAnnouncement(announcement)>0){
            map.put("status",0);
            map.put("message","添加成功");
        }
        else {
            map.put("status",1);
            map.put("message","添加失败");
        }

        return map;
    }




}
