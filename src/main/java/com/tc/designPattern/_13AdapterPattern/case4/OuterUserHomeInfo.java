package com.tc.designPattern._13AdapterPattern.case4;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户家庭信息
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    /**
     * 员工家庭信息
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
