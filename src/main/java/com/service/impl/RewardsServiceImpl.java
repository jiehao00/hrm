package com.service.impl;

import com.dao.RewardsInfoMapper;
import com.pojo.RewardsInfo;
import com.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
* @Description:    员工奖赏服务实现类
* @Author:         jieHao
* @CreateDate:     2019/5/4 14:50
* @UpdateUser:     jieHao
* @UpdateDate:     2019/5/4 14:50
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class RewardsServiceImpl implements RewardsService {
    @Autowired
    private RewardsInfoMapper rewardsInfoMapper;

    /**
    * 方法实现说明  添加员奖励记录
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/4 14:52
    */
    @Override
    public int insertRewards(RewardsInfo rewardsInfo) {
        return rewardsInfoMapper.insertSelective(rewardsInfo);
    }

    @Override
    public List<RewardsInfo> searchRewardsMessage(int start,int limit,RewardsInfo rewardsInfo) {
        return rewardsInfoMapper.searchRewardsMessage(start,limit,rewardsInfo);
    }

    @Override
    public int searchRewardsCount() {
        return rewardsInfoMapper.searchRewardsCount();
    }

    @Override
    public int delRewards(Integer rewardsId) {
        return rewardsInfoMapper.deleteByPrimaryKey(rewardsId);
    }
}
