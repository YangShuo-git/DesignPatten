package com.example.designpattern.adapter;

import android.os.Bundle;

import com.example.designpattern.app.AppConstant;
import com.example.designpattern.app.EMTagHandler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.view.View;

import com.example.designpattern.databinding.ActivityAdapterBinding;

import com.example.designpattern.R;

/**
 * 适配器模式:
 * 定义：将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。
 * 是直接提供一个独立的适配器类，还是继承一个类的接口来当适配器？
 * 手机充电器一般都是5V左右，家用交流电压220V，所以手机充电需要一个适配器
 */
public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAdapterBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_adapter);
        setTitle("适配器模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.ADAPTER_DEFINE));
        binding.btAdapterText.setText("将220V家用电转换为5V");

        binding.btAdapterText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mobile mobile = new Mobile();
                
                // 手机充电，需要220v转5v的适配器
                V5Power v5Power = new V220To5PowerAdapter(new V220Power());
                mobile.inputPower(v5Power);
            }
        });
    }
}