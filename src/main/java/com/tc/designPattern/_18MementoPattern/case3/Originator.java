package com.tc.designPattern._18MementoPattern.case3;

// 发起人自主备份和恢复
public class Originator implements Cloneable {
    private Originator backup;

    private String state = "";

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    //创建一个备忘录
    public void createMenmto(){
        this.backup = this.clone();
    }

    //恢复一个备忘录
    public void restoreMenento(){
        this.setState(this.backup.getState());
    }

    @Override
    protected Originator clone(){
        try {
            return  (Originator)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}