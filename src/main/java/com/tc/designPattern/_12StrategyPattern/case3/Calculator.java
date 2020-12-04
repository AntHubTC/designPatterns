package com.tc.designPattern._12StrategyPattern.case3;

/**
 * 策略模式扩展  枚举策略
 */
public enum Calculator {
    // 加法运算
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    // 减法运算
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    }
    ;
    String value = "";
    // 定义成员值类型
    Calculator(String value) {
        this.value = value;
    }
    // 获取枚举成员的值
    public String getValue() {
        return value;
    }
    // 声明一个抽象函数 实现这个抽象函数就是不同的策略处理
    public abstract int exec(int a, int b);
}
