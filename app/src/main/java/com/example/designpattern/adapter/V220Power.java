package com.example.designpattern.adapter;

import android.util.Log;

public class V220Power {
    public int provideV220Power() {
        Log.e("---", "需要适配到220v的家用电");
        return 220;
    }
}
