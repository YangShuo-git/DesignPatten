package com.example.designpattern.adapter;

import android.util.Log;

// 手机需要的是5v，但传进来的家用电是220v，所以需要适配器
public class Mobile {
    private static final String TAG = "Mobile";

    // 接入5v接口
    public void inputPower(V5Power v5Power) {
        Log.e(TAG, "手机充电需要的是5v电压, 而家用电是220v，需要适配器处理");
        int provideV5Power = v5Power.provideV5Power();
    }
}
