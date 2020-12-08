package com.tc.designPattern._18MementoPattern.case6;

/**
 * 发起人角色
 */
public class Originator {
    // 内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建一个备忘录
    public IMemento createMemento() {
        return new Memento(this.state);
    }
    // 恢复一个备忘录
    public void restoreMemento(IMemento memento) {
        String state = ((Memento) memento).getState();
        this.setState(state);
    }

    // ========私有内部类========
    private class Memento implements IMemento{
        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

}
