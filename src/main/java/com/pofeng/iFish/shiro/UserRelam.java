package com.pofeng.iFish.shiro;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.ArrayList;

public class UserRelam extends AuthorizingRealm {

    //授权---提供当前用户的权限和角色
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        return info;
    }

    //认证---登录校验
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取令牌
        UsernamePasswordToken token1 = (UsernamePasswordToken)token;
        //外界已经进行过登录校验，此处只需要进行对象封装
        if (token1.getUsername().length() > 0){
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(token1.getUsername(), token1.getPassword(), getName());
            //存储到Session
            //SecurityUtils.getSubject().getSession().setAttribute("username",token.getUsername());
            return info;
        }
        return null;
    }
}
