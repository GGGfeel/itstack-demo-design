package org.itstack.demo.design;

public abstract class AbstractDecorator implements HandlerInterceptor {

    private HandlerInterceptor handlerInterceptor;

    public AbstractDecorator(){}


    public AbstractDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }

}
