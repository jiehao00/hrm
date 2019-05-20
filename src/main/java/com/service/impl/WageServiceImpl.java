package com.service.impl;

import com.dao.ProInsuranceMapper;
import com.dao.WageInfoMapper;
import com.pojo.ProInsurance;
import com.pojo.WageInfo;
import com.service.WageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Description:    工资管理服务类实现类
* @Author:         jieHao
* @CreateDate:     2019/5/20 20:25
* @UpdateUser:     jieHao
* @UpdateDate:     2019/5/20 20:25
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class WageServiceImpl implements WageService {
    @Autowired
    private WageInfoMapper wageInfoMapper;

    @Autowired
    private ProInsuranceMapper proInsuranceMapper;

    /**
     * 方法实现说明 生成当月工资
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/5/21 0:06
     */
    @Override
    public int createWage(ProInsurance proInsurance) {
        return wageInfoMapper.createWage(proInsurance);
    }

    /**
    * 方法实现说明  搜索五险一金比例信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/21 0:06
    */
    @Override
    public ProInsurance searchProInsurance() {
        return proInsuranceMapper.searchProInsurance();
    }

    /**
     * 方法实现说明  删除当月重复工资数据
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/5/21 0:07
     */
    @Override
    public int delRepeatWage(ProInsurance proInsurance) {
        return wageInfoMapper.delRepeatWage(proInsurance);
    }

    /**
    * 方法实现说明  展示工资明细
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/21 0:08
    */
    @Override
    public List<WageInfo> searchWageInfo(int start, int limit,ProInsurance proInsurance) {
        return wageInfoMapper.searchWageInfo(start,limit,proInsurance);
    }

    /**
     * 方法实现说明  查找当月工资总数
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/5/21 0:09
     */
    @Override
    public int searchCount(ProInsurance proInsurance) {
        return wageInfoMapper.searchCount(proInsurance);
    }
}
