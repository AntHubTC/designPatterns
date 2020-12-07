package com.tc.designPattern._13AdapterPattern.case3;

/**
 * 场景类
 */
public class Client {


    public static void main(String[] args) {
        // 场景一
//        test1();
        // 场景二
        test2();
    }

    private static void test1() {
        // 没有与外部系统连接，上这样写的
        IUserInfo yougGril = new UserInfo();

        findYougGrid(yougGril, 101);
    }

    private static void test2() {
        // 老板一想不对呀，兔子不吃窝边草，还是找借用人员好点
        // 我们只修改了这句话
        IUserInfo yougGril = new OuterUserInfo();

        findYougGrid(yougGril, 101);
    }

    public static void findYougGrid(IUserInfo userInfo, int findNum) {
        // 从数据库查找101个
        for (int i = 0; i < findNum; i++) {
            String mobileNumber = userInfo.getMobileNumber();
            System.out.println(mobileNumber);
        }
    }
}
