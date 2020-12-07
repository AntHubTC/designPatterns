package com.tc.designPattern._16ObserverPattern.case3;

public class Client {
    public static void main(String[] args) {
        // 创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        // 定义一个观察者
        Observer observer = new ConcreteObserver();
        // 观察者观察被观察者
        subject.addObserver(observer);

        // 观察者开始活动了
        subject.doSomething();
    }
}
