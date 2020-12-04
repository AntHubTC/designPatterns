package com.tc.designPattern._12StrategyPattern.case1;

public class ZhaoYun {
    // 赵云出场了，他根据诸葛亮给他的交代，依次拆开妙计
    public static void main(String[] args) {
        Context context;
        // 刚刚到吴国的时候拆第一个
        System.out.println("----刚刚到吴国的时候拆第一个---");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n\n\n\n");

        // 刘备乐不思蜀了，拆第二个了
        System.out.println("----刘备乐不思蜀了，拆第二个了----");
        context = new Context(new Givengreenlight());
        context.operate();
        System.out.println("\n\n\n\n");

        // 孙权的小兵追来了，咋办？拆第三个
        System.out.println("----孙权的小兵追来了，咋办？拆第三个-----");
        context = new Context(new Blockenemy());
        context.operate();
        System.out.println("\n\n\n\n");

    }
}
