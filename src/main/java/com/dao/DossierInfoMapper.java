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

    /**
     * 方法实现说明  搜索员工信息
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/4/2 18:09
     */
    List<DossierInfo> searchDossierInfo(@Param("start")int start,@Param("rows")int rows,@Param("dossierInfo")DossierInfo dossierInfo);

    /**
     * 方法实现说明 搜索员工总数
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/4/2 18:09
     */
    int selectCountDossier();

    /**
     * 方法实现说明 删除员工
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/4/2 18:10
     */
    int delDossierInfo(DossierInfo dossierInfo);
}