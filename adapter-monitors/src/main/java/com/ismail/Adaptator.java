package com.ismail;

public class Adaptator implements VGA{


    HDMI hdmi;
    @Override
    public void print(String s) {
        byte[] b = s.getBytes();
        hdmi.print(b);
    }

    public Adaptator(HDMI hdmi)
    {
        this.hdmi = hdmi;
    }
}
