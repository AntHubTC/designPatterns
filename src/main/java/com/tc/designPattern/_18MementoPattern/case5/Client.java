package com.tc.designPattern._18MementoPattern.case5;

/**
 * 多备份的备忘录
 */
public class Client {
    public static void main(String[] args) {
        // 定义出发起人
        Originator originator = new Originator();
        // 定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        // 创建一个备忘录
        caretaker.setMementoMap("001", originator.createMemento());
        caretaker.setMementoMap("002", originator.createMemento());
        // 干xxxxx事
        // ......
        // 恢复一个指定标记的备忘录
        originator.restoreMemento(caretaker.getMementoMap("001"));
    }
}
