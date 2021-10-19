package org.itstack.demo.design.test;

import org.itstack.demo.design.LoginAbstractDecorator;
import org.itstack.demo.design.SsoInterceptor;
import org.itstack.demo.design.UserStatusDecorator;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_LoginSsoDecorator() {
        //装饰的对象 SsoInterceptor
        SsoInterceptor ssoInterceptor = new SsoInterceptor();
        //先装饰SsoInterceptor 一个单点校验功能
        LoginAbstractDecorator ssoDecorator = new LoginAbstractDecorator(ssoInterceptor);
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
        //在装饰SsoInterceptor 一个用户状态校验功能
        UserStatusDecorator userStatusDecorator = new UserStatusDecorator(ssoInterceptor);
        userStatusDecorator.preHandle(request,"xxxx","t");
    }

}
