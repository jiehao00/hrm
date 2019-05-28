package com.dao;

import com.pojo.ProInsurance;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProInsuranceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProInsurance record);

    int insertSelective(ProInsurance record);

    ProInsurance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProInsurance record);

    int updateByPrimaryKey(ProInsurance record);


    /**
     * 方法实现说明  搜索五险一金比例信息
     *
     * @return
     * @throws
     * @author jieHao
     * @param: null
     * @date 2019/5/21 0:06
     */
    ProInsurance searchProInsurance();


    List<ProInsurance> searchInsurance(@Param("start") int start, @Param("limit")int limit);

    int searchInsuranceCount();


    int resetState();


    int updateState(ProInsurance proInsurance);



}