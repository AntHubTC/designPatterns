package com.tc.designPattern._15CompositePattern.case2;

public class Client {
    public static void main(String[] args) {
        // 创建一个根节点
        Component root = new Composite();
        // 创建一个树枝构件
        Component branch = new Composite();
        // 创建一个叶子节点
        Component leaf = new Leaf();
        // 建立整体
        root.add(branch);
        branch.add(leaf);
        display(root);
    }

    // 通过递归遍历树
    public static void display(Component root) {
        root.doSomething();
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) { // 叶子节点/
                c.doSomething();
            } else { // 树枝节点
                display(c);
            }
        }
    }

}
