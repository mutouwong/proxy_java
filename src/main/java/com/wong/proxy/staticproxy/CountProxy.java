package com.wong.proxy.staticproxy;

/**
 * @Description: 账户代理类
 * @Author: gang.wang
 * @Date: Created in 下午5:32 2018/1/24
 */
public class CountProxy implements Count {

    private CountImpl countImpl;

    public CountProxy(CountImpl countImpl) {
        this.countImpl = countImpl;
    }

    public void queryCount() {
        System.out.println("查询账户的预处理——————");
        countImpl.queryCount();
        System.out.println("查询账户之后————————");
    }

    public void updateCount() {
        System.out.println("修改账户之前的预处理——————");
        countImpl.updateCount();
        System.out.println("修改账户之后——————————");
    }
}
