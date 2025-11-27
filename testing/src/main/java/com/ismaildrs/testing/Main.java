package com.ismaildrs.testing;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1, 2);
        list.size();
        list.remove(1);
        list.remove(new Integer(1));
        System.out.println(list);

        System.out.println(new Integer(2) == 2);
    }
}
