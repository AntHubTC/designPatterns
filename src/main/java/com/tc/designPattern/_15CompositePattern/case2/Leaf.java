package com.tc.designPattern._15CompositePattern.case2;

import java.util.ArrayList;

public class Leaf extends Component {
    @Deprecated
    public void add(Component component) throws UnsupportedOperationException {
        // 空实现,直接抛弃一个“不支持请求”异常
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void remove(Component component)
            throws UnsupportedOperationException {
        // 空实现
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public ArrayList<Component> getChildren()
            throws UnsupportedOperationException {
        // 空实现
        throw new UnsupportedOperationException();
    }

    public void doSomething() {
        System.out.println("我是一片叶！");
    }
}

