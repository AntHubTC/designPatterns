package com.tc.designPattern._13AdapterPattern.case4;

import java.util.Map;

/**
 * 适配器
 */
public class OuterUserInfo implements IUserInfo {
    // 源目标对象
    private IOuterUserBaseInfo baseInfo;
    private IOuterUserHomeInfo homeInfo;
    private IOuterUserOfficeInfo officeInfo;
    // 数据处理
    private Map baseMap;
    private Map homeMap;
    private Map officeMap;

    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;
        // 数据处理
        this.baseMap = baseInfo.getUserBaseInfo();
        this.homeMap = homeInfo.getUserHomeInfo();
        this.officeMap = officeInfo.getUserOfficeInfo();
    }

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
