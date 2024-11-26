package com.example.designpattern.factory.factorymethod;

import com.example.designpattern.factory.simplefactory.RouJiaMo;

/**
 * 3、工厂方法模式:
 * 定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。
 * 工厂方法模式把类实例化的过程推迟到子类。举例 在北京和西安 开分店
 *
 * 对照定义：
 1、定义了创建对象的一个接口：public abstract RouJiaMo sellRoujiaMo(String type);
 2、由子类决定实例化的类，可以看到肉夹馍是子类生成的。
 */

public abstract class RouJiaMoStore {
    public abstract RouJiaMo sellRouJiaMo(String type);
}
