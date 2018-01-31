package com.wong.proxy.staticproxy;

/**
 * @Description: 账户实现类
 * @Author: gang.wang
 * @Date: Created in 下午5:29 2018/1/24
 */
public class CountImpl implements Count {

    public void queryCount() {
        System.out.println("查询账户......");
    }

    public void updateCount() {
        System.out.println("修改账户......");
    }
}
