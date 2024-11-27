package com.example.designpattern.memento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.designpattern.R;
import com.example.designpattern.app.AppConstant;
import com.example.designpattern.app.EMTagHandler;
import com.example.designpattern.databinding.ActivityMementoBinding;

/**
 * 备忘录模式: 在不破坏封装的前提下，捕获一个对象的内部状态，
 * 并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
 * 发件人将状态保存至备忘录中，而备忘录由管理者管理
 */
public class MementoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMementoBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_memento);
        setTitle("备忘录模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.MEMENTO_DEFINE));

        binding.btUseMemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CareTaker careTaker = new CareTaker(); // 管理者
                Originator originator = new Originator(); // 发件人

                originator.setState("State #1");
                originator.setState("State #2");
                careTaker.add(originator.setSateToMemento()); // 第一次保存状态

                originator.setState("State #3");
                careTaker.add(originator.setSateToMemento()); // 第二次保存状态

                originator.setState("State #4");
                Log.e("---", "Current State: " + originator.getState());

                // 获取保存的状态
                String memento1 = originator.getStateFromMemento(careTaker.get(0));
                Log.e("---", "First Saved State: " + memento1);
                String memento2 = originator.getStateFromMemento(careTaker.get(1));
                Log.e("---", "Second Saved State: " + memento2);
            }
        });
    }
}