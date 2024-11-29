package com.example.designpattern.proxy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.designpattern.R;
import com.example.designpattern.app.AppConstant;
import com.example.designpattern.app.EMTagHandler;
import com.example.designpattern.databinding.ActivityProxyBinding;

/**
 * Proxy Pattern，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
 * 为其他对象提供一种代理以控制对这个对象的访问。
 * 主要解决：在直接访问对象时带来的问题，
 * 比如：在面向对象系统中，有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），
 * 直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
 */

public class ProxyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityProxyBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_proxy);
        setTitle("代理模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.PROXY_DEFINE));

        // 使用 ProxyImage 来获取 RealImage 类的对象
        final Image image = new ProxyImage("test_10mb.png");
        binding.btDisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 第一次是new的，图像从磁盘加载
                image.display();
            }
        });
        binding.btNoDisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 第二次取缓存，图像不需要从磁盘加载
                image.display();
            }
        });
    }
}