package com.tc.designPattern._16ObserverPattern.case1;

import java.util.ArrayList;
import java.util.List;

/**
 * 韩非子，李斯的师弟，韩国的重要人物
 */
public class HanFeiZi implements IHanFeiZi, Observable {

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    // 韩非子要吃饭了
    @Override
    public void notifyObservers(String str) {
        for (Observer observer : observerList) {
            observer.update(str);
        }
    }

    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        // 通知所有的观察者
        this.notifyObservers("韩非子在吃饭");
    }

    // 韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.notifyObservers("韩非子在娱乐");
    }
}
