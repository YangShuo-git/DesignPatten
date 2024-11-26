package com.example.designpattern.factory.abstractfactory;

public class BeijingRouJiaMoYLFactory implements IRouJiaMoYLFactory{
    @Override
    public Meet creatMeet() {
        // return new BeijingFreshMeet();
        return null;
    }

    @Override
    public YuanLiao creatYuanLiao() {
        // return new BeijingFreshMeet();
        return null;
    }
}
