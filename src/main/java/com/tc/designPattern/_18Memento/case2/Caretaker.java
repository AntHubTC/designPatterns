package com.tc.designPattern._18Memento.case2;

/**
 * 备忘录管理者
 */
public class Caretaker {
    // 备忘录对象
    private Memento memeto;

    public Memento getMemeto() {
        return memeto;
    }

    public void setMemeto(Memento memeto) {
        this.memeto = memeto;
    }
}
