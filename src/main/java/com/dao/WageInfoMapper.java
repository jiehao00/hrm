package com.dao;

import com.pojo.ProInsurance;
import com.pojo.WageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WageInfoMapper {
    int deleteByPrimaryKey(Integer wageId);

    int insert(WageInfo record);

    int insertSelective(WageInfo record);

    WageInfo selectByPrimaryKey(Integer wageId);

    int updateByPrimaryKeySelective(WageInfo record);

    int updateByPrimaryKey(WageInfo record);

    /**
     * 方法实现说明 生成当月工资
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/5/21 0:06
     */
    int createWage(@Param("proInsurance")ProInsurance proInsurance);

    /**
     * 方法实现说明  删除当月重复工资数据
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/5/21 0:07
     */
    int delRepeatWage(@Param("pro")ProInsurance proInsurance);

    /**
     * 方法实现说明  展示工资明细
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/5/21 0:08
     */
    List<WageInfo> searchWageInfo(@Param("start")int start,@Param("limit")int limit,@Param("pro")ProInsurance proInsurance);

    /**
     * 方法实现说明  查找当月工资总数
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/5/21 0:09
     */
    int  searchCount(@Param("pro")ProInsurance proInsurance);
}