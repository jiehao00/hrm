package com.service.impl;

import com.dao.PunishmentInfoMapper;
import com.pojo.PunishmentInfo;
import com.service.PunishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PunishmentServiceImpl implements PunishmentService {

    @Autowired
    private PunishmentInfoMapper punishmentInfoMapper;


    @Override
    public int insertPunishment(PunishmentInfo punishmentInfo) {
        return punishmentInfoMapper.insertSelective(punishmentInfo);
    }

    @Override
    public List<PunishmentInfo> searchPunishmentMessage(int start, int limit, PunishmentInfo punishmentInfo) {
        return punishmentInfoMapper.searchPunishmentMessage(start,limit,punishmentInfo);
    }

    @Override
    public int searchPunishmentCount() {
        return punishmentInfoMapper.searchPunishmentCount();
    }

    @Override
    public int delPunishment(Integer punishmentId) {
        return punishmentInfoMapper.deleteByPrimaryKey(punishmentId);
    }
}
