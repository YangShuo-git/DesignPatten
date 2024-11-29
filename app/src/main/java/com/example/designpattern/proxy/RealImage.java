package com.example.designpattern.proxy;

import android.util.Log;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        Log.e("RealImage", "loading " + fileName);
    }

    @Override
    public void display() {
        Log.e("RealImage", "Displaying " + fileName);
    }
}
