package com.wong.proxy;


import com.wong.proxy.dynamicproxy.CountCGLIBProxy;
import com.wong.proxy.staticproxy.CountImpl;
import org.assertj.core.internal.cglib.proxy.Enhancer;

/**
 * @Description: TODO
 * @Author: gang.wang
 * @Date: Created in 下午5:36 2018/1/24
 */
public class Test {

    public static void main(String[] args) {

        //静态代理
        /*CountImpl count = new CountImpl();
        CountProxy countProxy = new CountProxy(count);
        countProxy.queryCount();
        countProxy.updateCount();*/

        //jdk 动态代理
        /*CountJDKProxy countJDKProxy = new CountJDKProxy();
        Count icount = (Count) countJDKProxy.bind(new CountImpl());
        icount.queryCount();
        icount.updateCount();*/

        //CGLIB 动态代理
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CountImpl.class);
        enhancer.setCallback(new CountCGLIBProxy());
        CountImpl count = (CountImpl) enhancer.create();
        count.queryCount();
        count.updateCount();

    }



}
