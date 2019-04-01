package com.service.impl;

import com.dao.DossierInfoMapper;
import com.pojo.DossierInfo;
import com.service.DossierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DossierServiceImpl implements DossierService {

    @Autowired
    private DossierInfoMapper dossierInfoMapper;
    @Override
    public int insertDossierInfo(DossierInfo dossierInfo) {
        return dossierInfoMapper.insertSelective(dossierInfo);
    }

    @Override
    public List<DossierInfo> searchDossierInfo(int start, int limit) {
        return dossierInfoMapper.searchDossierInfo(start,limit);
    }

    @Override
    public int selectCountDossier() {
        return dossierInfoMapper.selectCountDossier();
    }
}
