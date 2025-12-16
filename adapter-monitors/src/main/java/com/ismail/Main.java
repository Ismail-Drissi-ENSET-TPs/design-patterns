package com.ismail;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Adaptator a = new Adaptator(new TV());
        UC uc = new UC();
        uc.setVga(a);
        uc.vga.print("Hello World");





    }
}