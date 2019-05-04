package com.service;

import com.pojo.PunishmentInfo;

import java.util.List;

public interface PunishmentService {

    int insertPunishment(PunishmentInfo punishmentInfo);

    List<PunishmentInfo>searchPunishmentMessage(int start, int limit,PunishmentInfo punishmentInfo);

    int searchPunishmentCount();

    int delPunishment(Integer punishmentId);
}
