package com.ismaildrs.testing.templates;

public class SpainImpl extends Template{

    @Override
    protected int param1() {
        return 20;
    }

    @Override
    protected double compute(int a, int b) {
        return a * b;
    }
}
