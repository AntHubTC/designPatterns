package com.tc.designPattern._13AdapterPattern.case4;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户基本信息
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    /**
     * 用户的基本信息
     * @return
     */
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();

        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工的电话号码是...");

        return baseInfoMap;
    }
}
