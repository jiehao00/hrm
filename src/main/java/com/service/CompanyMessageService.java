package com.service;

import com.pojo.CompanyInfo;
/**
* @Description:    公司信息服务类
* @Author:         jieHao
* @CreateDate:     2019/4/23 19:57
* @UpdateUser:     jieHao
* @UpdateDate:     2019/4/23 19:57
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface CompanyMessageService {


    /**
    * 方法实现说明  更新公司信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/23 19:58
    */
    int updateCompanyMessage(CompanyInfo companyInfo);


    /**
    * 方法实现说明   搜索公司信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/23 19:58
    */
    CompanyInfo searchCompanyMessage();
}
