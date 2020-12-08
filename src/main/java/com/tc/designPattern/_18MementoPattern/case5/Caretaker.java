package com.tc.designPattern._18MementoPattern.case5;

import java.util.HashMap;
import java.util.Map;

/**
 * 备忘录管理者
 */
public class Caretaker {
    // 容纳备忘录的容器
    private Map<String, Memento> mementoMap = new HashMap<>();

    public Memento getMementoMap(String idx) {
        return mementoMap.get(idx);
    }

    public void setMementoMap(String idx, Memento memento) {
        this.mementoMap.put(idx, memento);
    }
}
