package com.example.designpattern.factory.abstractfactory;

/**
 * 西安 简单工厂模式:
 * 用来西安店生产自己店里的肉夹馍
 */

public class XianTeSeSimpleRouJiaMoFactory {
    public RouJiaMo creatRouJiaMo(String type) {
        RouJiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new XianRouJiaMoSuan();
                break;
            default:
                roujiaMo = new XianRouJiaMoSuan();
                break;
        }
        return roujiaMo;
    }
}
