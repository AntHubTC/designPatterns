package com.tc.designPattern._06ProxyParttern.case8;

import java.lang.reflect.Method;

// 调用之前处理
@FunctionalInterface
public interface ProxyInvokeBefore {
    public void invoke(Object proxy, Method method, Object[] args);
}
