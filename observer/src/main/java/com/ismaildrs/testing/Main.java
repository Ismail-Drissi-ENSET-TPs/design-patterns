package com.ismaildrs.testing;

public class Main {

    static void main(String[] args) {
        Channel channel = new Channel();

        Subscriber subscriber1 = new Subscriber(channel);
        Subscriber subscriber2 = new Subscriber(channel);

        channel.register(subscriber1);
        channel.register(subscriber2);

        channel.updateChannelData(5);
    }

}
