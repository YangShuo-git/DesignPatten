package com.example.designpattern.builder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.designpattern.R;
import com.example.designpattern.databinding.ActivityBuilderBinding;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBuilderBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_builder);
        setTitle("建造者模式");
    }
}