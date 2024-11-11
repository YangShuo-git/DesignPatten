package com.example.designpattern.observer.interfaces;

/**
 * 所有的主题必须实现此接口
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
