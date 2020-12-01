package com.tc.designPattern._02FactoryParttern.case0.test;

import com.tc.designPattern._02FactoryParttern.case0.bean.ConcreteProduct1;
import com.tc.designPattern._02FactoryParttern.case0.factory.ConcreteCreator;
import com.tc.designPattern._02FactoryParttern.case0.factory.Creator;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        ConcreteProduct1 product = creator.createProduct(ConcreteProduct1.class);

        product.method1();
        product.method2();
    }
}
