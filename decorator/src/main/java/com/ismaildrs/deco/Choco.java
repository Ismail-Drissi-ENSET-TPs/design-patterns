package com.ismaildrs.deco;

import com.ismaildrs.boisson.Boisson;

public class Choco extends Decorator{


    public Choco(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return super.cout()+10;
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" Choco";
    }
}
