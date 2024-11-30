package com.example.designpattern.adapter;

/**
 * 将200v家用电转换为5v手机用电的适配器
 */
public class V5PowerAdapter implements V5Power{

    V220Power mV220Power = null;

    public V5PowerAdapter(V220Power v220Power) {
        mV220Power = v220Power;
    };

    @Override
    public int provideV5Power() {
        return mV220Power.provideV220Power();
    }
}
