package com.dao;

import com.pojo.PunishmentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PunishmentInfoMapper {
    int deleteByPrimaryKey(Integer punishmentId);

    int insert(PunishmentInfo record);

    int insertSelective(PunishmentInfo record);

    PunishmentInfo selectByPrimaryKey(Integer punishmentId);

    int updateByPrimaryKeySelective(PunishmentInfo record);

    int updateByPrimaryKey(PunishmentInfo record);

    List<PunishmentInfo> searchPunishmentMessage(@Param("start")int start,@Param("limit")int limit,@Param("punishmentInfo")PunishmentInfo punishmentInfo);

    int searchPunishmentCount();
}