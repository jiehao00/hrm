package com.dao;

import com.pojo.PunishmentInfo;

public interface PunishmentInfoMapper {
    int deleteByPrimaryKey(Integer punishmentId);

    int insert(PunishmentInfo record);

    int insertSelective(PunishmentInfo record);

    PunishmentInfo selectByPrimaryKey(Integer punishmentId);

    int updateByPrimaryKeySelective(PunishmentInfo record);

    int updateByPrimaryKey(PunishmentInfo record);
}