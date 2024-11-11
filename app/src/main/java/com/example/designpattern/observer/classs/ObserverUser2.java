package com.example.designpattern.observer.classs;

import android.util.Log;

import com.example.designpattern.observer.interfaces.Observer;
import com.example.designpattern.observer.interfaces.Subject;

public class ObserverUser2 implements Observer {
    public ObserverUser2(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        Log.e("-----ObserverUser2 ", "得到 3D 号码:" + msg + ", 放入钱包");
    }
}
