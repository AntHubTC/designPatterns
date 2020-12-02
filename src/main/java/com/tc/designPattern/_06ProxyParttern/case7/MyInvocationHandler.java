package com.tc.designPattern._06ProxyParttern.case7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的Handler类
 */
public class MyInvocationHandler implements InvocationHandler {
    // 被代理的对象
    private Object target = null;

    // 通过构造函数传递一个对象
    public MyInvocationHandler(Object _obj) {
        this.target = _obj;
    }

    // 代理方法
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // 寻找JoinPoint连接点，AOP框架使用元数据定义
        if (true) {
            // 执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        // 执行被代理的方法
        Object result = method.invoke(this.target, args);

        return result;
    }
}
