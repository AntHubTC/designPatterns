package com.tc.designPattern._06ProxyParttern.case8;

import java.lang.reflect.Method;

// 调用之处理
@FunctionalInterface
public interface ProxyInvokeAfter {
    public void invoke(Object proxy, Method method, Object[] args);
}
