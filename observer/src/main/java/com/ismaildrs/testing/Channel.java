package com.ismaildrs.testing;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Observable{

    private List<Observer> observers = new ArrayList<>();
    int data;

    @Override
    public void register(Observer observer){
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(var o : observers){
            o.update();
        }
    }

    public void updateChannelData(int data){
        this.data = data;
        notifyAllObservers();
    }
}
