package com.tc.designPattern._11DecoratorParttern.case1;

/**
 * 最高成绩修饰
 */
public class HighScoreDecorator extends Decorator {
    // 构造函数
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    // 我要汇报最高成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75, 数学书78, 自然色80");
    }
    // 我要在老爸看成绩单前告诉他最高成绩，否则等他一看，就抢棍子揍我，我哪里还有机会说哦

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
