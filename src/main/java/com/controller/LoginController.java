package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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


    @RequestMapping("login")
    @ResponseBody
    public Map login(String userName, String password){
        Map<String,Object> map = new HashMap<String, Object>();
        System.out.println("进入此方法");
        System.out.println(userName);
        System.out.println(password);
        map.put("errorCode", 0);
        map.put("message", "用户密码错误！");
        return map;


    }

}
