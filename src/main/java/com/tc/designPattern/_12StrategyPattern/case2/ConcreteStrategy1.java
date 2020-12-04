package com.tc.designPattern._12StrategyPattern.case2;

/**
 * 具体策略角色
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
