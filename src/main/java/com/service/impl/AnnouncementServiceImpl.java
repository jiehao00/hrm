package com.service.impl;


import com.dao.AnnouncementMapper;
import com.pojo.Announcement;
import com.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Description:    公告模块服务实现类
* @Author:         jieHao
* @CreateDate:     2019/5/31 20:25
* @UpdateUser:     jieHao
* @UpdateDate:     2019/5/31 20:25
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    private AnnouncementMapper announcementMapper;

    @Override
    public Announcement searchAnnouncement() {
        return announcementMapper.searchAnnouncement();
    }


    @Override
    public List<Announcement> searchAllAnnouncement(int start,int limit) {
        return announcementMapper.searchAllAnnouncement(start,limit);
    }

    @Override
    public int searchCount() {
        return announcementMapper.searchCount();
    }

    @Override
    public int resetState() {
        return announcementMapper.resetState();
    }

    @Override
    public int updateAnnouncementState(Announcement announcement) {
        return announcementMapper.updateAnnouncementState(announcement);
    }

    @Override
    public int addAnnouncement(Announcement announcement) {
      return announcementMapper.insertSelective(announcement);
    }
}
