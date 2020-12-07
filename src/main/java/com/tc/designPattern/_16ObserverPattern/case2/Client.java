package com.tc.designPattern._16ObserverPattern.case2;

import java.util.Observer;

/**
 * 观察者模式
 *      使用JDK自带的java.util.Observable类和java.util.Observer接口来实现。
 */
public class Client {
    public static void main(String[] args) {
        // 三个观察者生产出来
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer xuSi = new XuSi();

        // 定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();

        // 我们后人根据历史，描述这个场景，有三个人在观察韩非子
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(xuSi);

        // 然后我们看看韩非子正在干什么
        hanFeiZi.haveBreakfast();
    }
}
