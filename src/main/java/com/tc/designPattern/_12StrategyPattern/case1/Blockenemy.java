package com.tc.designPattern._12StrategyPattern.case1;

/**
 * 孙夫人断后
 */
public class Blockenemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("好夫人断后，挡住追兵！");
    }
}
