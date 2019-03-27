package com.controller;

import com.pojo.LoginMessage;
import com.service.LoginMessageService;
import com.util.PrimaryKeyUtil;
import com.util.RetryLimitHashedCredentialsMatcher;
import com.util.UsernamePasswordCaptchaToken;
import org.apache.shiro.SecurityUtils;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
* @Description:    登录控制类
* @Author:         jiang_jiehao
* @CreateDate:     2019/3/20 11:11
* @UpdateUser:     jiang_jiehao
* @UpdateDate:     2019/3/20 11:11
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
@RequestMapping("")
public class LoginController {

    @Autowired
    private RetryLimitHashedCredentialsMatcher matcher;

    @Autowired
    private LoginMessageService loginMessageService;

    /**
    * 方法实现说明  用户登陆
    * @author      jiang_jiehao
    *@param: null
    * @return
    * @exception
    * @date        2019/3/27 14:24
    */
    @RequestMapping(value = "login",method = RequestMethod.GET)
    @ResponseBody
    public Map login(String personnelId,String password) {
        Map<String, Object> map = new HashMap<String, Object>();
        int role = 0;
        UsernamePasswordCaptchaToken token = new UsernamePasswordCaptchaToken(personnelId, password, role);
        Subject subject=SecurityUtils.getSubject();

        try {
            subject.login(token);
            map.put("status", "0");
            map.put("message", "登录成功");
        } catch (UnknownAccountException e) {
            map.put("errorCode", "1");
            map.put("message", "用户不存在！");
        } catch (IncorrectCredentialsException e) {
            map.put("errorCode", "1");
            map.put("message", "账号或密码错误");
        }
        return map;
    }



    /**
    * 方法实现说明   用户注册
    * @author      jiang_jiehao
    *@param: null
    * @return
    * @exception
    * @date        2019/3/27 14:34
    */
    @RequestMapping(value ="HRRegister")
    @ResponseBody
    public Map register(LoginMessage loginMessage){
        Map<String,Object> map = new HashMap<String, Object>();

        loginMessage.setSalt(PrimaryKeyUtil.getAllRandomString(4));
        loginMessage.setPassword(new SimpleHash(matcher.getHashAlgorithmName(),loginMessage.getPassword(),loginMessage.getSalt(),
                matcher.getHashIterations()).toString());
        if(loginMessageService.insert(loginMessage)>0){
            map.put("status","注册成功");
        }else {
            map.put("status","注册失败");
        }
        return map;
    }

}
