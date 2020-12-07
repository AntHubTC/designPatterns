package com.tc.designPattern._16ObserverPattern.case1;


/**
 * 李斯  观察者，如果韩非子有情况就报告老板
 */
public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报...");
        this.reportToQinShiHuang(context);
        System.out.println("李斯：汇报完毕");
    }

    public void reportToQinShiHuang(String reportContent) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了-->" + reportContent);
    }
}
