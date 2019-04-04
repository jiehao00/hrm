package com.dao;

import com.pojo.LoginMessage;

/**
* @Description:    用户登录信息数据库操作类
* @Author:         jiang_jiehao
* @CreateDate:     2019/3/27 19:38
* @UpdateUser:     jiang_jiehao
* @UpdateDate:     2019/3/27 19:38
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface LoginMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoginMessage record);

    int insertSelective(LoginMessage record);

    LoginMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoginMessage record);

    int updateByPrimaryKey(LoginMessage record);

    /**
    * 方法实现说明   通过用户id查找用户信息
    * @author      jiang_jiehao
    *@param: null
    * @return
    * @exception
    * @date        2019/3/27 19:39
    */
    LoginMessage findMessage(Integer personnelId);


    int delLoginMessage(LoginMessage loginMessage);
}