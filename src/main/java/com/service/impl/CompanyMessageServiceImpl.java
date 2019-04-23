package com.service.impl;

import com.dao.CompanyInfoMapper;
import com.pojo.CompanyInfo;
import com.service.CompanyMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @Description:    公司信息服务实现类
* @Author:         jieHao
* @CreateDate:     2019/4/23 19:59
* @UpdateUser:     jieHao
* @UpdateDate:     2019/4/23 19:59
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class CompanyMessageServiceImpl implements CompanyMessageService {

    @Autowired
    private CompanyInfoMapper companyInfoMapper;


    /**
    * 方法实现说明  更新公司信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/23 20:03
    */
    @Override
    public int updateCompanyMessage(CompanyInfo companyInfo) {
        return companyInfoMapper.updateCompanyMessage(companyInfo);
    }

    /**
    * 方法实现说明   搜索公司信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/23 20:04
    */
    @Override
    public CompanyInfo searchCompanyMessage() {
        return companyInfoMapper.searchCompanyMessage();
    }
}
