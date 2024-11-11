package com.example.designpattern.observer;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.designpattern.R;
import com.example.designpattern.app.AppConstant;
import com.example.designpattern.app.EMTagHandler;
import com.example.designpattern.databinding.ActivityObserverBinding;
import com.example.designpattern.observer.classs.SubbjectFor3D;
import com.example.designpattern.observer.classs.ObserverUser1;
import com.example.designpattern.observer.classs.ObserverUser2;
import com.example.designpattern.observer.javautil.ObserverJava;
import com.example.designpattern.observer.javautil.SubjectFor3d;
import com.example.designpattern.observer.javautil.SubjectForSSQ;

/**
 * 可以看出，使用Java内置的类实现观察者模式，代码非常简洁，
 * addObserver,removeObserver,notifyObservers都已经为实现了，
 * 所有可以看出Observable（主题）是一个类，而不是一个接口，
 * 基本上书上都对于Java的如此设计抱有反面的态度，觉得Java内置的观察者模式，
 * 违法了面向接口编程这个原则，其实不然；
 * 比如这里自己实现的观察者模式，如果想继续添加很多个主题，
 * 每个主题的addObserver,removeObserver,notifyObservers代码基本都是相同的，
 * 接口是无法实现代码复用，而且也没有办法使用组合的模式实现这三个方法的复用，
 * 所以这里把这三个方法在类中实现是合理的。
 */
public class ObserverActivity extends AppCompatActivity implements View.OnClickListener {

    private SubbjectFor3D subbjectFor3D;
    private ObserverUser1 observerUser1;
    private ObserverUser2 observerUser2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObserverBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observer);
        setTitle("观察者模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.OBSERVER_DEFINE));

        binding.btMyself.setOnClickListener(this);
        binding.btSystem.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_myself:// 自己实现的观察者模式
                // 创建服务号
                subbjectFor3D = new SubbjectFor3D();

                // 创建两个订阅者
                observerUser1 = new ObserverUser1(subbjectFor3D);
                observerUser2 = new ObserverUser2(subbjectFor3D);

                // 主题更新信息
                subbjectFor3D.setMsg("201610121 的3D号为:127");
                break;
            case R.id.bt_system: //使用Java内置的类实现观察者模式
                loadSystemObserver();
                break;
            default:
                break;
        }
    }

    /**
     * 系统的观察者接口
     */
    private void loadSystemObserver() {
        // 创建2个服务号
        SubjectFor3d subjectFor3d = new SubjectFor3d();
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ();

        // 创建订阅者
        ObserverJava observerJava = new ObserverJava();
        observerJava.registerSubject(subjectFor3d);
        observerJava.registerSubject(subjectForSSQ);

        // 主题更新信息
        subjectFor3d.setMsg("3d nums : 110 ");
        subjectForSSQ.setMsg("ssq nums : 12,13,31,5,4,3 15");
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (observerUser1 != null) {
            subbjectFor3D.removeObserver(observerUser1);
        }
        if (observerUser2 != null) {
            subbjectFor3D.removeObserver(observerUser2);
        }
        subbjectFor3D = null;
    }
}
