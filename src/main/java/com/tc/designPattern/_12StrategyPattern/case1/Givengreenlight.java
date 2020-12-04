package com.tc.designPattern._12StrategyPattern.case1;

/**
 * 吴国太开绿灯
 */
public class Givengreenlight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行！");
    }
}
