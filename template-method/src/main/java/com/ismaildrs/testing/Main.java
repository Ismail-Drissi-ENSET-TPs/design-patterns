package com.ismaildrs.testing;

import com.ismaildrs.testing.templates.MoroccoImpl;
import com.ismaildrs.testing.templates.SpainImpl;
import com.ismaildrs.testing.templates.Template;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Template template = new MoroccoImpl();
        Template template2 = new SpainImpl();
        System.out.println(template.perform(10, 20));
        System.out.println(template2.perform(10, 20));
    }
}