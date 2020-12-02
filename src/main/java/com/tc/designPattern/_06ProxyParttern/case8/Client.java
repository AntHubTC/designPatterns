package com.tc.designPattern._06ProxyParttern.case8;

import java.lang.reflect.Method;

public class Client {
    public static void main(String[] mainArgs) {
        // 真实角色
//        Landlord landlord = new Landlord();

        // 代理角色： 现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler(new Landlord());
        // 设置前置处理
        pih.setProxyInvokeBefore((Object proxy, Method method, Object[] args) -> {
            System.out.println("[debug] 调用" + method.getName() + "方法 start...");
        });
        // 设置后置处理
        pih.setProxyInvokeAfter((Object proxy, Method method, Object[] args) -> {
            System.out.println("[debug] 调用" + method.getName() + "方法 end...");
        });
        // 这里的proxyObj手动态生成的，我们并没有去写
        Rent proxyObj = pih.getProxyObj();

        proxyObj.rent();
        proxyObj.argument();
    }
}
