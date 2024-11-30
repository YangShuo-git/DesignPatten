package com.example.designpattern.adapter;

import android.util.Log;

/**
 * 适配器：将220v家用电转换为5v
 */
public class V220To5PowerAdapter implements V5Power {
    private static final String TAG = "V220To5PowerAdapter";
    V220Power mV220Power = null;

    public V220To5PowerAdapter(V220Power v220Power) {
        mV220Power = v220Power;
    };

    @Override
    public int provideV5Power() {
        int result = 0;
        if (mV220Power.provideV220Power() == 220) {
            Log.e(TAG, "适配器: 经过复杂的操作,已将" + mV220Power.provideV220Power() + "v转为5v");
            result = 5;
        }
        return result;
    }
}
