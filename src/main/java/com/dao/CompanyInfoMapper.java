package com.dao;

import com.pojo.CompanyInfo;

/**
* 方法实现说明  公司信息数据库操作接口
* @author      jieHao
*@param: null
* @return
* @exception
* @date        2019/4/23 20:05
*/
public interface CompanyInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    CompanyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);


    /**
    * 方法实现说明 更新公司信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/23 20:05
    */
    int updateCompanyMessage(CompanyInfo companyInfo);

    /**
    * 方法实现说明  搜索公司信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/23 20:05
    */
    CompanyInfo searchCompanyMessage();
}