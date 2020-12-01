package com.tc.designPattern._02FactoryParttern.case0.factory;

import com.tc.designPattern._02FactoryParttern.case0.bean.Product;

// 抽象工厂类
public abstract class Creator {
    /**
     * 创建一个产品对象，其输入参数类型可以自行设置，
     * 通常为String、Enum、Class等，当然也可以为空
     *
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
