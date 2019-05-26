package com.dao;

import com.pojo.TrainingInfo;
import com.pojo.TransferredInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrainingInfoMapper {
    int deleteByPrimaryKey(Integer trainingId);

    int insert(TrainingInfo record);

    int insertSelective(TrainingInfo record);

    TrainingInfo selectByPrimaryKey(Integer trainingId);

    int updateByPrimaryKeySelective(TrainingInfo record);

    int updateByPrimaryKey(TrainingInfo record);


    TrainingInfo findIsExitSignUpMessage(TrainingInfo trainingInfo);

    List<TrainingInfo> findEnrolledCourse(@Param("start")int start,@Param("limit")int limit,@Param("trainingInfo")TrainingInfo trainingInfo);

    int  searchCount(TrainingInfo trainingInfo);

}