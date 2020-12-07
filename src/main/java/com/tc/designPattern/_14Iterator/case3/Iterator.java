package com.tc.designPattern._14Iterator.case3;

/**
 * 抽象迭代器
 * @param <E>
 */
public interface Iterator<E> {
    // 遍历到下一个元素
    public E next();
    // 是否已经遍历到尾部
    public boolean hasNext();
    // 删除当前指向的元素
    public default boolean remove() {
        throw new UnsupportedOperationException("当前不支持删除操作!");
    }
}
