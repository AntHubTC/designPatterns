package com.tc.designPattern._10ChainParttern.case1;

// 儿子类
public class Son implements IHandler {
    // 母亲向儿子请示
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
