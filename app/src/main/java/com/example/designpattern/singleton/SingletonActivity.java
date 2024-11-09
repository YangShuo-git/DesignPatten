package com.example.designpattern.singleton;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.designpattern.R;
import com.example.designpattern.app.AppConstant;
import com.example.designpattern.app.EMTagHandler;
import com.example.designpattern.databinding.ActivitySingletonBinding;
import com.example.designpattern.singleton.ehan.SingletonEHan;
import com.example.designpattern.singleton.enums.SingletonEnum;
import com.example.designpattern.singleton.inclass.SingletonIn;
import com.example.designpattern.singleton.lanhan.SingletonLanHan;

public class SingletonActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("单例设计模式");

        ActivitySingletonBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_singleton);
        binding.btEhan.setOnClickListener(this);
        binding.btLanhan.setOnClickListener(this);
        binding.btInclass.setOnClickListener(this);
        binding.btEnum.setOnClickListener(this);
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.SINGLETON_DEFINE));
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_ehan:// 饿汉式[可用]
                SingletonEHan instance = SingletonEHan.getInstance();
                break;
            case R.id.bt_lanhan:// 懒汉式[双重校验锁 推荐用]
                SingletonLanHan singletonLanHanFour = SingletonLanHan.getSingletonLanHanFour();
                break;
            case R.id.bt_inclass://内部类[推荐用]
                SingletonIn singletonIn = SingletonIn.getSingletonIn();
                break;
            case R.id.bt_enum:// 枚举[推荐用]
                SingletonEnum.instance.whateverMethod();
                break;
            default:
                break;
        }
    }
}
