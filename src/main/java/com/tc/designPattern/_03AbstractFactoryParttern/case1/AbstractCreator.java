package com.tc.designPattern._03AbstractFactoryParttern.case1;

/**
 * 抽象工厂类
 */
public abstract class AbstractCreator {
    // 创建A产品家族
    public abstract AbstractProductA createProductA();
    // 创建B产品家族
    public abstract AbstractProductB createProductB();
}
