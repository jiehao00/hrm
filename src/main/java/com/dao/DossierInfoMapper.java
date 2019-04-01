package com.dao;

import com.pojo.DossierInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DossierInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DossierInfo record);

    int insertSelective(DossierInfo record);

    DossierInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DossierInfo record);

    int updateByPrimaryKey(DossierInfo record);

    List<DossierInfo> searchDossierInfo(@Param("start")int start,@Param("rows")int rows);

    int selectCountDossier();
}