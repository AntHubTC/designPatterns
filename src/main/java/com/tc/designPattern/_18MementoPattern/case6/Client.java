package com.tc.designPattern._18MementoPattern.case6;

/**
 * 备忘录模式(封装得更好一点  内部类)
 */
public class Client {
    public static void main(String[] args) {
        // 定义出发起人
        Originator originator = new Originator();
        // 定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        // 创建一个备忘录
        caretaker.setMemeto(originator.createMemento());
        // 干xxxxx事
        // ......
        // 当做什么事都没发生，恢复最初状态
        originator.restoreMemento(caretaker.getMemeto());
    }
}
