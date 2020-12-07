package com.tc.designPattern._14IteratorPattern.case3;

/**
 * 抽象容器
 */
public interface Agreegate {
    public void add(Object object);
    public void remove(Object object);
    public <E> Iterator<E> iterator();
}
