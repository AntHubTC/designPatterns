package com.tc.designPattern._16ObserverPattern.case1;

/**
 * 许斯  观察者，如果韩非子有情况就报告老板
 */
public class XuSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("许斯：观察到韩非子活动，开始向老板汇报...");
        this.reportToQinShiHuang(context);
        System.out.println("许斯：汇报完毕");
    }

    public void reportToQinShiHuang(String reportContent) {
        System.out.println("许斯：老板，检测到韩非子在搞事情！-->" + reportContent);
    }
}
