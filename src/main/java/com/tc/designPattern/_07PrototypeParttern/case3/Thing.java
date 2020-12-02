package com.tc.designPattern._07PrototypeParttern.case3;

import java.util.ArrayList;

/**
 * 深拷贝
 */
public class Thing implements Cloneable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();
//    要进行克隆，不能定义用final修饰
//    private final ArrayList<String> arrayList = new ArrayList<String>();

    //设置HashMap的值
    public void setValue(String value){
        this.arrayList.add(value);
    }

    //取得arrayList的值
    public ArrayList<String> getValue(){
        return this.arrayList;
    }

    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing)super.clone();
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
