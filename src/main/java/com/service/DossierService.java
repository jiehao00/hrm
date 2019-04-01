package com.service;

import com.pojo.DossierInfo;

import java.util.List;

public interface DossierService {

     int insertDossierInfo(DossierInfo dossierInfo);

     List<DossierInfo> searchDossierInfo(int start, int limit);

     int selectCountDossier();

}
