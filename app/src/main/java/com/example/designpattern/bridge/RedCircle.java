package com.example.designpattern.bridge;

import android.util.Log;

/**
 * 2. 创建桥接实现类: 实现了 DrawAPI 接口的实体。
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        Log.e("---", "Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}
