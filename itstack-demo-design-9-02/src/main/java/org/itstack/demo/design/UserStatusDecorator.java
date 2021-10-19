package org.itstack.demo.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author shanke.jl
 * @Date: 2021/10/18 8:30 下午
 */
public class UserStatusDecorator extends AbstractDecorator {

    private Logger logger = LoggerFactory.getLogger(LoginAbstractDecorator.class);

    public UserStatusDecorator(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean b = super.preHandle(request, response, handler);
        if(!b){
            return false;
        }

        System.out.println("用户状态校验通过");
        return  true;
    }
}
