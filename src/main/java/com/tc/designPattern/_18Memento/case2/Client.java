package com.tc.designPattern._18Memento.case2;

/**
 * 备忘录模式
 *      备忘录模式通俗来讲，就是一个对象的备份模式，提供了一种程序数据的备份方法
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
