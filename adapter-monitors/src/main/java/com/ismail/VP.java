package com.ismail;

public class VP implements VGA{
    @Override
    public void print(String m) {
        System.out.println("***************");
        System.out.println("VP "+m);
        System.out.println("***************");
    }
}
