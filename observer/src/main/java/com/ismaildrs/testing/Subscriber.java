package com.ismaildrs.testing;

public class Subscriber implements Observer {

    private Channel subject;
    private double data;

    public Subscriber(Channel subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        data = subject.data;
        System.out.println("New data: " + data);

    }

}
