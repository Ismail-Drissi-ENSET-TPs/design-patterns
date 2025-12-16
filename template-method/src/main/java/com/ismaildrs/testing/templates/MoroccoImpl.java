package com.ismaildrs.testing.templates;

public class MoroccoImpl extends Template{

    @Override
    protected int param1() {
        return 10;
    }

    @Override
    protected double compute(int a, int b) {
        return a + b;
    }
}
