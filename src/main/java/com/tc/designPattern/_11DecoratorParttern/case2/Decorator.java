package com.tc.designPattern._11DecoratorParttern.case2;

public abstract class Decorator extends Component {
    private Component component;
    // 通过构造函数传递给被修饰者
    public Decorator(Component component) {
        this.component = component;
    }

    // 委托给被修饰者执行

    @Override
    public void operate() {
        this.component.operate();
    }
}
