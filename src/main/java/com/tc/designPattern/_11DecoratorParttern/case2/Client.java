package com.tc.designPattern._11DecoratorParttern.case2;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 第一次装饰
        component = new ConcreteDecorator1(component);
        // 第二次装饰
        component = new ConcreteDecorator2(component);
        // 修饰后允许
        component.operate();
    }
}
