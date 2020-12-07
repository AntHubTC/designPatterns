package com.tc.designPattern._14Iterator.case2;

import java.util.ArrayList;
import java.util.List;

public class ProjectIterator implements IProjectIterator {
    private List<IProject> projectList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    // 判断是否还有元素，必须实现
    @Override
    public boolean hasNext() {
        boolean flag = true;
        if (this.currentItem == projectList.size() || this.projectList.get(this.currentItem) == null) {
            flag = false;
        }
        return flag;
    }

    // 获得下一个值
    @Override
    public Object next() {
        return this.projectList.get(this.currentItem++);
    }

    // 删除一个对象
    @Override
    public void remove() {
        // 暂时没哟使用到
    }
}
