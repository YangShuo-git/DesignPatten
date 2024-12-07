package com.example.designpattern.builder;

import android.util.Log;

/**
 * 2、产品类
 */
public class Product {

    private String name;
    private String type;

    public void showProduct() {
        Log.e("---", "名称：" + name);
        Log.e("---", "型号：" + type);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}

