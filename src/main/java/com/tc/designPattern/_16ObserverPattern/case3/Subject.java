package com.tc.designPattern._16ObserverPattern.case3;

import java.util.Vector;

public abstract class Subject {
    // 定义一个观察者数组
    private Vector<Observer> observers = new Vector<Observer>();

    // 增加一个观察者
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    // 删除一个观察者
    public void deleteObserver(Observer o) {
        this.observers.remove(o);
    }

    // 通知所有观察者
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
