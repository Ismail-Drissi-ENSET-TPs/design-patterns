package com.ismaildrs.deco;

import com.ismaildrs.boisson.Boisson;

public class Caramel extends Decorator{

    public Caramel(Boisson boisson) {
        super(boisson);
    }
    @Override
    public double cout() {
        return super.cout()+5;
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" Caramel";
    }
}
