package com.example.designpattern.observer.javautil;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * 对于JDK或者Andorid中都有很多地方实现了观察者模式，
 * 比如XXXView.addXXXListenter ， 当然了 XXXView.setOnXXXListener不一定是观察者模式，
 * 因为观察者模式是一种一对多的关系，对于setXXXListener是1对1的关系，应该叫回调。
 */

public class ObserverJava implements Observer {

    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectFor3d) {
            SubjectFor3d subjectFor3d = (SubjectFor3d) o;
            Log.e("SubjectFor3d:", "subjectFor3d msg -- >" + subjectFor3d.getMsg());
        }
        if (o instanceof SubjectForSSQ) {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            Log.e("SubjectForSSQ:", "subjectForSSQ msg -- >" + subjectForSSQ.getMsg());
        }
    }
}
