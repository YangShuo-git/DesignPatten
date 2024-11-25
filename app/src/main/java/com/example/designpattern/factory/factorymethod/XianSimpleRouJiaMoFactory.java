package com.example.designpattern.factory.factorymethod;

import com.example.designpattern.factory.simplefactory.RouJiaMo;

/**
 * 西安 简单工厂模式:
 * 用来西安店生产自己店里的肉夹馍
 */

public class XianSimpleRouJiaMoFactory {
    public RouJiaMo creatRouJiaMo(String type) {
        RouJiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new XianRouJiaMoSun();
                break;
            default:
                roujiaMo = new XianRouJiaMoSun();
                break;
        }
        return roujiaMo;
    }
}
