package com.service.impl;

import com.dao.LoginMessageMapper;
import com.pojo.LoginMessage;
import com.service.LoginMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
* @Description:    用户信息service实现类
* @Author:         jiang_jiehao
* @CreateDate:     2019/3/27 19:36
* @UpdateUser:     jiang_jiehao
* @UpdateDate:     2019/3/27 19:36
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class LoginMessageServiceImpl implements LoginMessageService {


    @Autowired
    private LoginMessageMapper loginMessageMapper;


    /**
    * 方法实现说明   插入用户信息
    * @author      jiang_jiehao
    *@param: null
    * @return
    * @exception
    * @date        2019/3/27 19:36
    */
    @Override
    public int insert(LoginMessage loginMessage) {
        return loginMessageMapper.insertSelective(loginMessage);
    }



    /**
    * 方法实现说明  查找用户信息
    * @author      jiang_jiehao
    *@param: null
    * @return
    * @exception
    * @date        2019/3/27 19:37
    */
    @Override
    public LoginMessage findMessage(Integer id) {
        return loginMessageMapper.findMessage(id);
    }


}
