package com.tc.designPattern._16ObserverPattern.case1;

public interface Observable {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers(String str);
}
