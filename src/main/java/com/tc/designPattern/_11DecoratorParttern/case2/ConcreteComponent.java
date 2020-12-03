package com.tc.designPattern._11DecoratorParttern.case2;

/**
 * 具体构件
 */
public class ConcreteComponent extends Component {
    // 抽象的方法
    @Override
    public void operate() {
        System.out.println("do Something");
    }
}
