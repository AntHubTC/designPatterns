package com.tc.designPattern._14IteratorPattern.case2;

public class Boss {
    public static void main(String[] args) {
        IProject project = new Project();

        project.add("星期大战项目", 10, 100000);
        project.add("扭转时空项目", 100, 10000000);
        project.add("超人改造项目", 10000, 100000);

        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i*5, i*1000000);
        }

        // 遍历一下list，将所有的数据都取出
        for (IProjectIterator it = project.iterator(); it.hasNext(); ) {
            IProject tp = (IProject) it.next();
            System.out.println(tp.getProjectInfo());
        }
    }
}
