package com.tc.designPattern._18MementoPattern.case6;

/**
 * 备忘录管理者
 */
public class Caretaker {
    // 备忘录对象
    private IMemento memeto;

    public IMemento getMemeto() {
        return memeto;
    }

    public void setMemeto(IMemento memeto) {
        this.memeto = memeto;
    }
}
