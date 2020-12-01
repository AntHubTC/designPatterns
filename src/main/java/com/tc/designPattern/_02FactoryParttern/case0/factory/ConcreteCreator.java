package com.tc.designPattern._02FactoryParttern.case0.factory;

import com.tc.designPattern._02FactoryParttern.case0.bean.Product;

// 具体工厂
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;

        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            // 异常处理
            e.printStackTrace();
        }

        return (T) product;
    }
}
