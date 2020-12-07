package com.tc.designPattern._14Iterator.case3;

public class Client {
    public static void main(String[] args) {
        Agreegate agg = new ConcreteAggregate();
        agg.add("abc");
        agg.add("aaa");
        agg.add("1234");

        Iterator iterator = agg.iterator();
        while (iterator.hasNext()) {
            Object aggregate = iterator.next();
            System.out.println(aggregate);
        }
    }
}
