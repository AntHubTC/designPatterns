package com.tc.designPattern._18MementoPattern.case3;

/**
 * 备忘录模式扩展
 *     clone方式备忘录：clone方式就是配合原型模式，由一个类控制，备忘录的生产和恢复，由于是一个类包含了所有的功能，所以也不需要中转类备忘录管理员角色了。
 */
public class Client {
    public static void main(String[] args) {
        //定义一个发起人
        Originator originator = new Originator();
        //建立初始状态
        originator.setState("这是初始状态");
        System.out.println("当前状态:"+originator.getState());
        //建立备份
        originator.createMenmto();
        //修改状态
        originator.setState("修改状态了");
        System.out.println("当前状态:"+originator.getState());
        //恢复状态
        originator.restoreMenento();
        System.out.println("当前状态:"+originator.getState());
    }
}
