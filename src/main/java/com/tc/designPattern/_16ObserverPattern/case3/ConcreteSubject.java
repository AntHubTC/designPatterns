package com.tc.designPattern._16ObserverPattern.case3;

public class ConcreteSubject extends Subject {
    // 具体的业务
    public void doSomething() {
        // .....
        super.notifyObservers();
    }
}
