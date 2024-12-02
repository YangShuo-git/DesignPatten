package com.example.designpattern.decorator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.designpattern.R;
import com.example.designpattern.app.AppConstant;
import com.example.designpattern.app.EMTagHandler;
import com.example.designpattern.databinding.ActivityDecoratorBinding;

/**
 * 装饰器模式
 * 若要扩展功能，装饰者提供了比集成更有弹性的替代方案，动态地将责任附加到对象上。
 * 当设计好了一个类，需要给这个类添加一些辅助的功能，并且不希望改变这个类的代码，这时候需要装饰者模式。
 * 这里还体现了一个原则：类应该对扩展开放，对修改关闭。
 * eg:
 * 1、武器（攻击力20）、戒指（攻击力5）、护腕（攻击力5）、鞋子（攻击力5）
 * 2、蓝宝石（攻击力5/颗）、黄宝石（攻击力10/颗）、红宝石（攻击力15/颗）
 * 3、每个装备可以随意镶嵌3颗
 */
public class DecoratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDecoratorBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_decorator);
        setTitle("装饰器模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.DECORATOR_DEFINE));

    }
}