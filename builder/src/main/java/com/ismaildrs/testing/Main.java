package com.ismaildrs.testing;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        HttpRequest postRequest = new HttpRequest.Builder().url("https://www.theodo.ma").method("POST").body("{'msg':'hello'}").build();

        System.out.println(postRequest);
    }
}
