package com.tc.designPattern._11DecoratorParttern.case1;

public class Father {
    public static void noDecoratorShow() {
        // 把成绩单拿过来
        SchoolReport schoolReport = new FouthGradeSchoolReport();
        // 看成绩单
        schoolReport.report();
        // 签名？休想！
        System.out.println("爸：就这成绩！签名，休想！！！");
        System.out.println("你：呜呜呜呜！~");
    }

    public static void decoratorShow() {
        // 把成绩单拿过来
        FouthGradeSchoolReport fgsr = new FouthGradeSchoolReport();

        SchoolReport schoolReport;
        // 第一层装饰
        schoolReport = new HighScoreDecorator(fgsr);
        // 第二层装饰
        schoolReport = new SortScoreDecorator(schoolReport);

        schoolReport.report();
        schoolReport.sign("老三");

        System.out.println();
        System.out.println("爸：幺儿，这成绩还是可以，继续努力！！！");
        System.out.println("你：哈哈哈哈哈，ok！~");
    }

    public static void main(String[] args) {
        // 采用未装饰展示成绩
//        noDecoratorShow();
        // 装饰后展示成绩
        decoratorShow();
    }
}
