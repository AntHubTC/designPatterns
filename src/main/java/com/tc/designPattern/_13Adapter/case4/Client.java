package com.tc.designPattern._13Adapter.case4;

/**
 * 适配器的扩展
 *
 *   如何将多个接口和实现适配为内部的一个接口。java是不支持多继承的，但是可以通过类关联的方式实现。
 *   对象适配器和类适配器的区别：类适配器是类间继承，对象适配器是对象的合成关系，也可以说是类的关联关系，这是两者的区别。
 */
public class Client {
    public static void main(String[] args) {
        // 外系统的人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        // 传递是三个对象
        OuterUserInfo yougGirl = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
        // 从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            String mobileNumber = yougGirl.getMobileNumber();
            System.out.println(mobileNumber);
        }
    }
}
