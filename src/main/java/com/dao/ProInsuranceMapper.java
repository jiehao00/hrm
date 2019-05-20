package com.dao;

import com.pojo.ProInsurance;

public interface ProInsuranceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProInsurance record);

    int insertSelective(ProInsurance record);

    ProInsurance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProInsurance record);

    int updateByPrimaryKey(ProInsurance record);


    /**
     * 方法实现说明  搜索五险一金比例信息
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/5/21 0:06
     */
    ProInsurance searchProInsurance();
}