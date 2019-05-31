package com.dao;

import com.pojo.Announcement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnnouncementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Announcement record);

    int insertSelective(Announcement record);

    Announcement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKey(Announcement record);



     Announcement searchAnnouncement();


     List<Announcement> searchAllAnnouncement(@Param("start")int start,@Param("limit")int limit);

     int searchCount();


     int resetState();

     int updateAnnouncementState(Announcement announcement);
}