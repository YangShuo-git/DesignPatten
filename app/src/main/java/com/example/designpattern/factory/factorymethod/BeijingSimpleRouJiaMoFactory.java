package com.example.designpattern.factory.factorymethod;

import com.example.designpattern.factory.simplefactory.RouJiaMo;

public class BeijingSimpleRouJiaMoFactory {
    public RouJiaMo creatRouJiaMo(String type) {
        RouJiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new BeijingRouJiaMoSuan();
                break;
            default:
                roujiaMo = new BeijingRouJiaMoSuan();
                break;
        }
        return roujiaMo;
    }
}