package com.tc.designPattern._02FactoryParttern.case3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *  工厂方法模式扩展：替代单例模式。
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class<?> cl = Class.forName(Singleton.class.getName());
            // 获得无参构造
            Constructor<?> constructor = cl.getDeclaredConstructor();
            // 设置无参构造是可访问的
            constructor.setAccessible(true);
            // 产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
