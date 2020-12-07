package com.tc.designPattern._14IteratorPattern.case1;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    public static void main(String[] args) {
        List<IProject> projectList = new ArrayList<>();
        projectList.add(new Project("星期大战项目", 10, 100000));
        projectList.add(new Project("扭转时空项目", 100, 10000000));
        projectList.add(new Project("超人改造项目", 10000, 100000));

        for (int i = 4; i < 104; i++) {
            projectList.add(new Project("第" + i + "个项目", i*5, i*1000000));
        }

        // 遍历一下list，将所有的数据都取出
        for (IProject project : projectList) {
            System.out.println(project.getProjectInfo());
        }
    }
}
