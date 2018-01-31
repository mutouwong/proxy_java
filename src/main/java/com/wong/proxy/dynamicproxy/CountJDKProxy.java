package com.wong.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: JDK动态代理
 * @Author: gang.wang
 * @Date: Created in 上午9:10 2018/1/31
 */
public class CountJDKProxy implements InvocationHandler {

    private Object delegate;

    public Object bind(Object delegate) {
        this.delegate = delegate;
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(),delegate.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try{
            System.out.println("Before JDK Proxy");
            result = method.invoke(delegate,args);
            System.out.println("After JDK Proxy");
        }catch (Exception e){
            throw e;
        }
        return result;
    }
}
