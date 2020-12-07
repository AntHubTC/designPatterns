package com.tc.designPattern._15CompositePattern.case1;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Corp implements IBranch {
    // 小兵
    private List<ICorp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    @Override
    public void addSubordinate(ICorp corp) {
        // 设置上司
        corp.setParent(this);
        // 添加下属
        this.subordinateList.add(corp);
    }

    @Override
    public List<ICorp> getSubordinate() {
        return this.subordinateList;
    }
}
