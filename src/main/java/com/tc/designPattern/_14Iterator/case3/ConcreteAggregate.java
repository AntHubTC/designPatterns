package com.tc.designPattern._14Iterator.case3;

import java.util.Vector;

/**
 * 具体容器
 */
public class ConcreteAggregate implements Agreegate {
    // 容纳对象的容器
    private Vector vector = new Vector();

    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public void remove(Object object) {
        this.vector.remove(object);
    }

    @Override
    public <E> Iterator<E> iterator() {
        return new Concreteiterator(this.vector);
    }
}
