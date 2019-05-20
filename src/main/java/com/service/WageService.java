package com.service;

import com.pojo.ProInsurance;
import com.pojo.WageInfo;

import java.util.List;

/**
* @Description:    工资服务类
* @Author:         jieHao
* @CreateDate:     2019/5/20 20:25
* @UpdateUser:     jieHao
* @UpdateDate:     2019/5/20 20:25
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface WageService {

    /**
    * 方法实现说明 生成当月工资
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/21 0:06
    */
    int createWage(ProInsurance proInsurance);

    /**
     * 方法实现说明  搜索五险一金比例信息
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/5/21 0:06
     */
    ProInsurance searchProInsurance();

    /**
    * 方法实现说明  删除当月重复工资数据
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/21 0:07
    */
    int delRepeatWage(ProInsurance proInsurance);

    /**
     * 方法实现说明  展示工资明细
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/5/21 0:08
     */
    List<WageInfo>searchWageInfo(int start, int limit,ProInsurance proInsurance);

    /**
    * 方法实现说明  查找当月工资总数
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/21 0:09
    */
    int  searchCount(ProInsurance proInsurance);
}
