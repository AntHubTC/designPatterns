package com.tc.designPattern._06ProxyParttern.case8;

// 房东
public class Landlord implements Rent {
    public void rent() {
        System.out.println("房东要出租房子");
    }

    @Override
    public void argument() {
        System.out.println("房东签了出租房屋合同");
    }
}
