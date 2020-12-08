package com.tc.designPattern._18MementoPattern.case4;

import java.util.Map;

/**
 * 备忘录角色
 */
public class Memento {
    // 接收HashMap作为状态
    private Map<String, Object> stateMap;
    // 接收一个对象，建立一个备份
    public Memento(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public Map<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
