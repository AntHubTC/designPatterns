package com.tc.designPattern._16ObserverPattern.case2;

import java.util.Observable;
import java.util.Observer;

/**
 * 王斯  观察者，如果韩非子有情况就报告老板
 */
public class WangSi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("王斯：观察到韩非子活动，开始向老板汇报...");
        this.reportToQinShiHuang((String) arg);
        System.out.println("王斯：汇报完毕");
    }

    public void reportToQinShiHuang(String reportContent) {
        System.out.println("王斯：老秦啊！韩非子有活动了-->" + reportContent);
        hit();
    }

    public void hit() {
        System.out.println("王斯：弄死它鸭的！");
    }
}
