package com.example.designpattern.bridge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.designpattern.R;
import com.example.designpattern.databinding.ActivityBridgeBinding;

public class BridgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBridgeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_bridge);
        setTitle("桥接模式");
    }
}