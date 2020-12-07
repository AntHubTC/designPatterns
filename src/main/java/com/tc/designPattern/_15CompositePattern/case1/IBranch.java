package com.tc.designPattern._15CompositePattern.case1;

import java.util.List;

public interface IBranch extends ICorp {
    // 能够添加小兵
    public void addSubordinate(ICorp corp);
    // 能够获取下属信息
    public List<ICorp> getSubordinate();
}
