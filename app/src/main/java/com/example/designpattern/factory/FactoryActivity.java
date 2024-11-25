package com.example.designpattern.factory;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.designpattern.R;
import com.example.designpattern.app.AppConstant;
import com.example.designpattern.app.EMTagHandler;
import com.example.designpattern.databinding.ActivityFactoryBinding;
import com.example.designpattern.factory.factorymethod.BeijingRouJiaMoStore;
import com.example.designpattern.factory.factorymethod.BeijingSimpleRouJiaMoFactory;
import com.example.designpattern.factory.factorymethod.XianRouJiaMoStore;
import com.example.designpattern.factory.factorymethod.XianSimpleRouJiaMoFactory;
import com.example.designpattern.factory.simplefactory.RouJiaMoStore;
import com.example.designpattern.factory.simplefactory.SimpleRouJiaMoFactory;

/**
 * 1、静态工厂模式
 * 这个最常见，项目中的辅助类，TextUtil.isEmpty等，类+静态方法。
 */
public class FactoryActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityFactoryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_factory);
        setTitle("工厂模式");

        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.JDGC_FACTORY_DEFINE));
        binding.tvDefine2.setText(EMTagHandler.fromHtml(AppConstant.GCFF_FACTORY_DEFINE));
        binding.tvDefine3.setText(EMTagHandler.fromHtml(AppConstant.CXGC_FACTORY_DEFINE));
        initListener();
    }

    private void initListener() {
        binding.btStaticFactory.setOnClickListener(this);
        binding.btSimpleFactory.setOnClickListener(this);
        binding.btFactoryMethod.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_static_factory: // 1.静态工厂模式
                Toast.makeText(this, "TextUtil.isEmpty等，类+静态方法.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_simple_factory: // 2.简单工厂模式
                RouJiaMoStore rouJiaMoStore = new RouJiaMoStore(new SimpleRouJiaMoFactory());
                rouJiaMoStore.sellRouJiaMo("Suan");
                rouJiaMoStore.sellRouJiaMo("Tian");
                rouJiaMoStore.sellRouJiaMo("La");
                break;
            case R.id.bt_factory_method: // 3.工厂方法模式 (开分店)
                XianRouJiaMoStore xianRoujiaMoStore = new XianRouJiaMoStore(new XianSimpleRouJiaMoFactory());
                xianRoujiaMoStore.sellRouJiaMo("Suan");

                BeijingRouJiaMoStore bjRoujiaMoStore = new BeijingRouJiaMoStore(new BeijingSimpleRouJiaMoFactory());
                bjRoujiaMoStore.sellRouJiaMo("Suan");
                break;
            default:
                break;
        }
    }
}