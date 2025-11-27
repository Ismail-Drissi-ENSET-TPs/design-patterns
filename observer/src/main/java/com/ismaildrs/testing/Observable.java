package com.ismaildrs.testing;

public interface Observable {


    void register(Observer o);
    void unregister(Observer o);
    void notifyAllObservers();

}
