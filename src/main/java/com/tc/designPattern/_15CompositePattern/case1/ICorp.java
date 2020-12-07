package com.tc.designPattern._15CompositePattern.case1;

public interface ICorp {
    // 每个员工都有信息，你想隐藏，门儿都没有
    public String getInfo();
    // 设置上司
    void setParent(Corp _parent);
}
