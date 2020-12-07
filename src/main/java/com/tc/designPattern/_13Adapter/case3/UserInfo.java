package com.tc.designPattern._13Adapter.case3;

/**
 * 实现类
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        String userName = "员工的姓名是...";
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = "员工的的家庭住址是...";
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = "员工的电话号码是...";
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = "员工的办公室电话是...";
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = "员工的职位是BOSS...";
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = "员工的家庭电话号码是...";
        return homeTelNumber;
    }
}
