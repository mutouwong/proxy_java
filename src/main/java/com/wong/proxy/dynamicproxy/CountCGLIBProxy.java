package com.wong.proxy.dynamicproxy;

import com.wong.proxy.staticproxy.CountImpl;
import org.assertj.core.internal.cglib.proxy.Enhancer;
import org.assertj.core.internal.cglib.proxy.MethodInterceptor;
import org.assertj.core.internal.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description: CGLIB动态代理
 * @Author: gang.wang
 * @Date: Created in 上午9:29 2018/1/31
 */
public class CountCGLIBProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before CGLIB Proxy");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("After CGLIB Proxy");
        return result;
    }
}
