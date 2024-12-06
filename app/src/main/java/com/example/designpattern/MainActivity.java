package com.example.designpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designpattern.adapter.AdapterActivity;
import com.example.designpattern.bridge.BridgeActivity;
import com.example.designpattern.builder.BuilderActivity;
import com.example.designpattern.databinding.ActivityMainBinding;
import com.example.designpattern.decorator.DecoratorActivity;
import com.example.designpattern.factory.FactoryActivity;
import com.example.designpattern.memento.MementoActivity;
import com.example.designpattern.observer.ObserverActivity;
import com.example.designpattern.proxy.ProxyActivity;
import com.example.designpattern.singleton.SingletonActivity;

import java.lang.reflect.Proxy;
import java.util.Arrays;

import me.jingbin.library.ByRecyclerView;
import me.jingbin.library.adapter.BaseByViewHolder;
import me.jingbin.library.adapter.BaseRecyclerAdapter;
import me.jingbin.library.decoration.GridSpaceItemDecoration;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private String[] patterns = {
            "单例模式",  "观察者模式",
            "工厂模式",  "备忘录模式",
            "代理模式",  "适配器模式",
            "装饰器模式", "桥接模式",
            "建造者模式",
    };
    private Class[] classes = {
            SingletonActivity.class, ObserverActivity.class,
            FactoryActivity.class,   MementoActivity.class,
            ProxyActivity.class,     AdapterActivity.class,
            DecoratorActivity.class, BridgeActivity.class,
            BuilderActivity.class,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initView();
    }

    private void initView() {
        binding.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        binding.recyclerView.addItemDecoration(new GridSpaceItemDecoration(10).setEndFromSize(0));

        BaseRecyclerAdapter<String> adapter = new BaseRecyclerAdapter<String>(R.layout.item_main,
                Arrays.asList(patterns)) {
            @Override
            protected void bindView(BaseByViewHolder holder, String title, int position) {
                holder.setText(R.id.bt_button, title);
            }
        };
        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setOnItemClickListener(new ByRecyclerView.OnItemClickListener() {
            @Override
            public void onClick(View v, int position) {
                startActivity(new Intent(v.getContext(), classes[position]));
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding.recyclerView.destroy();
    }
}