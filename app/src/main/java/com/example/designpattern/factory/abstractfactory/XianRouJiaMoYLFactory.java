package com.example.designpattern.factory.abstractfactory;

public class XianRouJiaMoYLFactory implements IRouJiaMoYLFactory{
    @Override
    public Meet creatMeet() { return new XianFreshMeet(); }

    @Override
    public YuanLiao creatYuanLiao() {
        return new XianTeSeYuanLiao();
    }
}
