package com.example.designpattern.factory.factorymethod;


import com.example.designpattern.factory.simplefactory.RouJiaMo;

public class XianRouJiaMoStore extends RouJiaMoStore {
    private XianSimpleRouJiaMoFactory factory;

    public XianRouJiaMoStore(XianSimpleRouJiaMoFactory factory) {
        this.factory = factory;
    }

    @Override
    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo roujiaMo = factory.creatRouJiaMo(type);
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
