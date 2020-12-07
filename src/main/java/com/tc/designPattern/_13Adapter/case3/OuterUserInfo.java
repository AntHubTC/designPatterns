package com.tc.designPattern._13Adapter.case3;

import java.util.Map;

/**
 * 中专角色
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseMap = super.getUserBaseInfo(); // 员工基本信息
    private Map homeMap = super.getUserHomeInfo(); // 员工的家庭信息
    private Map officeMap = super.getUserOfficeInfo(); // 工作信息

    @Override
    public String getUserName() {
        return (String) baseMap.get("userName");
    }

    @Override
    public String getHomeAddress() {
        return (String) homeMap.get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        return (String) baseMap.get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        return (String) officeMap.get("officeTelNumber");
    }

    @Override
    public String getJobPosition() {
        return (String) officeMap.get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {
        return (String) homeMap.get("homeTelNumber");
    }
}
