package com.dao;

import com.pojo.RewardsInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RewardsInfoMapper {
    int deleteByPrimaryKey(Integer rewardsId);

    int insert(RewardsInfo record);

    int insertSelective(RewardsInfo record);

    RewardsInfo selectByPrimaryKey(Integer rewardsId);

    int updateByPrimaryKeySelective(RewardsInfo record);

    int updateByPrimaryKey(RewardsInfo record);

    List<RewardsInfo> searchRewardsMessage(@Param("start")int start,@Param("limit")int limit,@Param("rewardsInfo")RewardsInfo rewardsInfo);

    int searchRewardsCount();

    int delRewards(RewardsInfo rewardsInfo);
}