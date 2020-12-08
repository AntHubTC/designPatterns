package com.tc.designPattern._17FacadePattern.case2;

/**
 * 门面模式
 *      要求子系统的外部与其内部的通信必须通过一个统一的对象进行。门面模式提供一个高层次的接口，使得子系统更容易使用。
 */
public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    //提供外部访问的方法
    public void methodA(){
        this.a.doSomething();
    }
    public void methodB(){
        this.b.doSomething();
    }
    public void methodC(){
        this.c.doSomething();
    }
}
