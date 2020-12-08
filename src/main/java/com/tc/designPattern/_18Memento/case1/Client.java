package com.tc.designPattern._18Memento.case1;

public class Client {
    public static void main(String[] args) {
        // 声明出主角
        Boy boy = new Boy();
        // 声明出备忘录管理者
        Caretaker caretaker = new Caretaker();
        // 初始化当前状态
        boy.setState("心情很棒！");
        System.out.println("====男孩现在的状态====");
        System.out.println(boy.getState());
        // 需要记录下当前状态呀
        caretaker.setMemeto(boy.createMemento());
        // 男孩去追女孩、状态改变
        boy.changeState();
        System.out.println("\n=====男孩追女孩后的状态=====");
        System.out.println(boy.getState());
        // 追女孩失败，恢复原状
        boy.restoreMemnto(caretaker.getMemeto());
        System.out.println("\n======男孩恢复后的状态======");
        System.out.println(boy.getState());
    }
}
