package com.tc.designPattern._15CompositePattern.case1;

public class Leaf extends Corp implements ILeaf {
    public Leaf(String name, String position, int salary) {
        super(name, position, salary);
    }
}
