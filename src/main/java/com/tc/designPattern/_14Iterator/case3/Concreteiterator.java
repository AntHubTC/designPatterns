package com.tc.designPattern._14Iterator.case3;

import java.util.Vector;

/**
 * 具体迭代器
 */
public class Concreteiterator implements Iterator {
    private Vector vector = new Vector();
    // 定义当前游标
    private int cursor = 0;

    public Concreteiterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public boolean hasNext() {
        return this.cursor < this.vector.size();
    }

    @Override
    public Object next() {
        return hasNext() ? this.vector.get(this.cursor++) : null;
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);

        return true;
    }
}
