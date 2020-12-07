package com.tc.designPattern._14Iterator.case2;

import java.util.ArrayList;
import java.util.List;

public class Project implements IProject {
    // 项目名称
    private String name = "";
    // 项目成员数量
    private int num = 0;
    // 项目费用
    private int cost = 0;

    // 定义一个项目列表，所有的项目都在这里
    private List<IProject> projectList = new ArrayList<>();

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";

        info = info + "项目名称是:" + this.name;
        info = info + "\t项目人数:" + this.num;
        info = info + "\t项目费用:" + this.cost;

        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
