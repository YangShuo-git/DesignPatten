package com.example.designpattern.factory.abstractfactory;

/**
 * 4、抽象工厂模式:
 * 定义：提供一个接口，用于创建相关的或依赖对象的家族，而不需要明确指定具体类。
 * 不同分店提供不同的特色原料，西安特色、北京特色
 */

public interface IRouJiaMoYLFactory {
    // 生产肉
    public Meet creatMeet();

    // 生产原料
    public YuanLiao creatYuanLiao();
}