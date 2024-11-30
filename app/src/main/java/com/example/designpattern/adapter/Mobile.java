package com.example.designpattern.adapter;

import android.util.Log;

public class Mobile {
    // 这里传入的是 5v接口,实现了这个接口的类也可以传入
    public void inputPower(V5Power v5Power) {
        int provideV5Power = v5Power.provideV5Power();
        Log.e("---", "手机需要的是5V电压充电, 已经适配到" + provideV5Power + "V");
    }
}
