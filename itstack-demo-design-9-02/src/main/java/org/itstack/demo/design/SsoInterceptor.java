package org.itstack.demo.design;

/**
 * @author shanke.jl
 * @Date: 2021/10/18 8:43 下午
 */
public class SsoInterceptor extends AbstractDecorator{

    public SsoInterceptor() {
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return super.preHandle(request, response, handler);
    }
}
