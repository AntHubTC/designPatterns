package com.tc.designPattern._13AdapterPattern.case3;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
    /**
     * 员工的基本信息
     * @return
     */
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();

        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工的电话号码是...");

        return baseInfoMap;
    }

    /**
     * 员工的工作信息
     * @return
     */
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();

        officeInfo.put("jobPosition", "这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");

        return officeInfo;
    }

    /**
     * 员工的家庭信息
     * @return
     */
    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber", "员工家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");

        return homeInfo;
    }
}
