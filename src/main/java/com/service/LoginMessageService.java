package com.service;

import com.pojo.LoginMessage;

/**
* @Description:    用户登录服务类
* @Author:         jiang_jiehao
* @CreateDate:     2019/3/27 19:34
* @UpdateUser:     jiang_jiehao
* @UpdateDate:     2019/3/27 19:34
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface LoginMessageService {

    /**
    * 方法实现说明  插入用户登录信息
    * @author      jiang_jiehao
    *@param: null
    * @return
    * @exception
    * @date        2019/3/27 19:35
    */
    public  int insert(LoginMessage loginMessage);


    /**
    * 方法实现说明   通过用户id查找信息
    * @author      jiang_jiehao
    *@param: null
    * @return
    * @exception
    * @date        2019/3/27 19:35
    */
    LoginMessage findMessage(Integer id);


}
