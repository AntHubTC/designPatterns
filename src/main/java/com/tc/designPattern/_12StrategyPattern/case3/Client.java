package com.tc.designPattern._12StrategyPattern.case3;

import java.util.Arrays;

/**
 * 枚举扩展： 使用枚举类型实现策略模式
 */
public class Client {
    public static void main(String[] args) {
        // 输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        // 符号
        String symbol = args[1];
        // 参数b
        int b = Integer.parseInt(args[2]);

        System.out.println("输入的参数为：" + Arrays.toString(args));

        int result = Calculator.ADD.exec(a, b);
        System.out.println("a + b = " + result);

        result = Calculator.SUB.exec(a, b);
        System.out.println("a - b = " + result);
    }
}
