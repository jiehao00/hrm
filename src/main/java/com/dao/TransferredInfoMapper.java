package com.dao;

import com.pojo.TransferredInfo;

public interface TransferredInfoMapper {
    int deleteByPrimaryKey(Integer transferredId);

    int insert(TransferredInfo record);

    int insertSelective(TransferredInfo record);

    TransferredInfo selectByPrimaryKey(Integer transferredId);

    int updateByPrimaryKeySelective(TransferredInfo record);

    int updateByPrimaryKey(TransferredInfo record);
}