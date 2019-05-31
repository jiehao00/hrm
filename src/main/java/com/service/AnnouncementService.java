package com.service;


import com.pojo.Announcement;

import java.util.List;

/**
* @Description:    公告模块服务类
* @Author:         jieHao
* @CreateDate:     2019/5/31 20:26
* @UpdateUser:     jieHao
* @UpdateDate:     2019/5/31 20:26
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface AnnouncementService {

    Announcement searchAnnouncement();



    List<Announcement> searchAllAnnouncement(int start,int limit);

    int searchCount();


    int resetState();

    int updateAnnouncementState(Announcement announcement);


    int addAnnouncement(Announcement announcement);

}
