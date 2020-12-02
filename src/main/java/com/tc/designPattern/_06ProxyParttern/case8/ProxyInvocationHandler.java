package com.tc.designPattern._06ProxyParttern.case8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    // 被代理的对象
    private Object proxyedObj;
    // 操作之前处理动作
    private ProxyInvokeBefore proxyInvokeBefore;
    // 操作之后处理动作
    private ProxyInvokeAfter proxyInvokeAfter;

    public ProxyInvocationHandler(Object proxyedObj) {
        this.proxyedObj = proxyedObj;
    }

    // 生成得到代理累
    public <T> T getProxyObj() {
        return (T) Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                this.proxyedObj.getClass().getInterfaces(),
                this);
    }

    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 操作之前处理
        if (null != proxyInvokeBefore) proxyInvokeBefore.invoke(proxy, method, args);
        // 动态代理的本质，就是使用反射机制实现！
        Object result = method.invoke(proxyedObj, args);
        // 操作之后处理
        if (null != proxyInvokeAfter) proxyInvokeAfter.invoke(proxy, method, args);

        return result;
    }

    public Object getProxyedObj() {
        return proxyedObj;
    }

    public void setProxyedObj(Object proxyedObj) {
        this.proxyedObj = proxyedObj;
    }

    public ProxyInvokeBefore getProxyInvokeBefore() {
        return proxyInvokeBefore;
    }

    public void setProxyInvokeBefore(ProxyInvokeBefore proxyInvokeBefore) {
        this.proxyInvokeBefore = proxyInvokeBefore;
    }

    public ProxyInvokeAfter getProxyInvokeAfter() {
        return proxyInvokeAfter;
    }

    public void setProxyInvokeAfter(ProxyInvokeAfter proxyInvokeAfter) {
        this.proxyInvokeAfter = proxyInvokeAfter;
    }
}
