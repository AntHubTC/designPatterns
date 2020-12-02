package com.tc.designPattern._07PrototypeParttern.case1;

import java.io.Serializable;

public class PrototypeClass2 implements Serializable, Cloneable {
    final PrototypeClass fvar = new PrototypeClass();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PrototypeClass2 cObj = (PrototypeClass2)super.clone();

        //  当一个属性被final标识了，那么就不能调用clone方法，否则编译器会报错。
//        cObj.fvar = this.fvar.clone();

        return cObj;
    }
}
