package com.example.designpattern.factory.simplefactory;
/**
 * 2、简单工厂模式
 * 专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
 * 这个工厂可以根据传进来的tyoe，生产不同的产品
 */

public class SimpleRouJiaMoFactory {
    public RouJiaMo creatRouJiaMo(String type) {
        RouJiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new RouJiaMoSuan();
                break;
            case "La":
                roujiaMo = new RouJiaMoLa();
                break;
            case "Tian":
                roujiaMo = new RouJiaMoLa();
                break;
            default:
                roujiaMo = new RouJiaMoSuan();
                break;
        }
        return roujiaMo;
    }
}
