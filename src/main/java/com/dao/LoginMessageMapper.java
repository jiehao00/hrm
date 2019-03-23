package com.dao;

import com.pojo.LoginMessage;

public interface LoginMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoginMessage record);

    int insertSelective(LoginMessage record);

    LoginMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoginMessage record);

    int updateByPrimaryKey(LoginMessage record);
}