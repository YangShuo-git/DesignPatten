package com.example.designpattern.factory.abstractfactory;

import android.util.Log;

public class RouJiaMo {
    protected String name = "无";

    public void prepare(IRouJiaMoYLFactory roujiaMoYLFactoryI) {
        Meet meet = roujiaMoYLFactoryI.creatMeet();
        YuanLiao yuanLiao = roujiaMoYLFactoryI.creatYuanLiao();
        Log.e("---RouJiaMo:",  name + ": 揉面-剁肉  原料："
                + meet.meet + " + " + yuanLiao.yuanliao);
    }

    public void fire() {
        Log.e("---RouJiaMo:", name + ": 肉夹馍-烘烤");
    }

    public void pack() {
        Log.e("---RouJiaMo:", name + ": 肉夹馍-包装");
    }
}
