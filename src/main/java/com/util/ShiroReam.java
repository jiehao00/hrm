package com.util;




import com.pojo.LoginMessage;

import com.service.LoginMessageService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
* @Description:    shiro登录验证、权限分配
* @Author:         jiehao
* @CreateDate:     2018/11/22 16:11
* @UpdateUser:     jiehao
* @UpdateDate:     2018/11/22 16:11
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ShiroReam extends AuthorizingRealm {


    @Autowired
    private LoginMessageService loginMessageService;


   /**
   * 方法实现说明
   * @author      jiehao
   * @param
   * @return
   * @exception  ：分配权限
   * @date        2018/11/22 16:21
   */
   @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        String username=principalCollection.getPrimaryPrincipal().toString();


        return simpleAuthorizationInfo;
    }

    /**
    * 方法实现说明    登录验证
    * @author：      jiehao
    * @param
    * @return：
    * @exception：
    * @date：       2018/11/29 10:24
    */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws  AuthenticationException {
        UsernamePasswordCaptchaToken token= (UsernamePasswordCaptchaToken) authenticationToken;
        String personnelId=token.getUsername();
        LoginMessage loginMessage=loginMessageService.findMessage(Integer.valueOf(personnelId));
        if (loginMessage == null){
            throw new UnknownAccountException();
        }else {
            ByteSource salt=ByteSource.Util.bytes(loginMessage.getSalt());
            return new SimpleAuthenticationInfo(loginMessage,loginMessage.getPassword(),salt,getName());
        }
    }
}
