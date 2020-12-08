package com.tc.designPattern._18MementoPattern.case4;

/**
 * 备忘录模式 -- 多状态的备忘录模式
 */
public class Client {
    public static void main(String[] args) {
        // 定义出发起人
        Originator originator = new Originator();
        // 定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        // 初始化
        originator.setState1("中国");
        originator.setState2("繁荣");
        originator.setState3("昌盛");
        System.out.println("===初始化状态===\n" + originator);
        // 创建一个备忘录
        caretaker.setMemeto(originator.createMemento());

        // 修改状态值
        originator.setState1("软件");
        originator.setState2("架构");
        originator.setState3("优秀");
        System.out.println("\n===修改后状态===\n" + originator);

        // 恢复一个备忘录
        originator.restoreMemento(caretaker.getMemeto());
        System.out.println("\n===恢复后状态===\n" + originator);
    }
}
