package com.service;

import com.pojo.RewardsInfo;

import java.util.List;

/**
* @Description:    员工奖赏服务接口
* @Author:         jieHao
* @CreateDate:     2019/5/4 14:50
* @UpdateUser:     jieHao
* @UpdateDate:     2019/5/4 14:50
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface RewardsService {

    /**
    * 方法实现说明   添加员奖励记录
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/4 14:53
    */
    int insertRewards(RewardsInfo rewardsInfo);


    List<RewardsInfo> searchRewardsMessage(int start,int limit,RewardsInfo rewardsInfo);

    int searchRewardsCount();


    int delRewards(Integer rewardsId);


}
