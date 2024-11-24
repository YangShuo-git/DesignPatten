package com.example.designpattern.factory.simplefactory;

import android.util.Log;

public abstract class RouJiaMo {

    protected String name;

    public void prepare() {
        Log.e("---RouJiaMo:", name + ": 揉面-剁肉");
    }

    public void fire() {
        Log.e("---RouJiaMo:", name + ": 肉夹馍-烘烤");
    }

    public void pack() {
        Log.e("---RouJiaMo:", name + ": 肉夹馍-包装");
    }
}
