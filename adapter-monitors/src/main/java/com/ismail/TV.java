package com.ismail;

public class TV implements HDMI {

    @Override
    public void print(byte[] bytes) {
        System.out.println("#############");
        System.out.println("TV "+bytes);
        System.out.println("#############");
    }
}
