package com.example.designpattern.factory.abstractfactory;


public class XianTeSeRouJiaMoStore extends RouJiaMoStore {
    private XianTeSeSimpleRouJiaMoFactory factory;

    public XianTeSeRouJiaMoStore(XianTeSeSimpleRouJiaMoFactory factory) {
        this.factory = factory;
    }

    @Override
    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo roujiaMo = factory.creatRouJiaMo(type);

        roujiaMo.prepare(new XianRouJiaMoYLFactory());
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
